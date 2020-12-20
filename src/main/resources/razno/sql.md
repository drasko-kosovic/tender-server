SELECT 
  public.ponude.id,
  public.ponude.partija,
  public.ponude.atc,
  public.ponude.naziv_proizvoda,
  public.ponude.zasticeni_naziv,
  public.ponude.proizvodjac,
  public.ponude.jedinica_mjere,
  public.ponude.trazena_kolicina,
  public.ponude.ponudjana_kolicina,
  public.ponude.procijenjena_jedinicna_cijena,
  public.ponude.ponudjena_jedinicna_cijena,
  public.ponude.procijenjena_ukupna_cijena,
  public.ponude.ponudjena_ukupna_cijena,
  public.ponude.rok_isporuke,
  public.ponude.ponudjac,
  public.ponude.broj_tendera,
  public.najmanji_rok.najmanji_rok,
  public.najmanja_cijena.najmanja_cijena,
  (public.najmanja_cijena.najmanja_cijena/public.ponude.ponudjena_ukupna_cijena)*90 AS bod_cijena,
  (public.najmanji_rok.najmanji_rok/public.ponude.rok_isporuke)*10 AS bod_isporuka,
  (((public.najmanja_cijena.najmanja_cijena/public.ponude.ponudjena_ukupna_cijena)*90)+
  ((public.najmanji_rok.najmanji_rok/public.ponude.rok_isporuke)*10))AS bod_ukupno
FROM
  public.ponude
  INNER JOIN public.najmanji_rok ON (public.ponude.partija = public.najmanji_rok.partija)
  AND (public.ponude.broj_tendera = public.najmanji_rok.broj_tendera)
  INNER JOIN public.najmanja_cijena ON (public.ponude.partija = public.najmanja_cijena.partija)
  AND (public.ponude.broj_tendera = public.najmanja_cijena.broj_tendera)
