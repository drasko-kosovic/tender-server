SELECT 
  ponude.partija,ponude.atc,ponude.naziv_proizvoda,
  ponude.zasticeni_naziv,ponude.proizvodjac,ponude.farmaceutski_oblik,ponude.pakovanje,
  ponude.trazena_kolicina,ponude.ponudjana_kolicina, 
  ponude.procijenjena_jedinicna_cijena, 
  ponude.ponudjena_jedinicna_cijena, 
  ponude.procijenjena_ukupna_cijena, 
  ponude.ponudjena_ukupna_cijena, 
  ponude.rok_isporuke, 
  ponude.ponudjac, 
  ponude.broj_tendera,
  min(ponude.ponudjena_ukupna_cijena) AS najmanja_cijena,
  min(ponude.rok_isporuke) AS najmanji_rok,
  ((min(ponude.ponudjena_ukupna_cijena) /
    ponude.ponudjena_ukupna_cijena) * (90)::numeric) AS bod_cijena,
    ((min(ponude.rok_isporuke)/ ponude.rok_isporuke) * 10) AS bod_isporuka,
    (((min(ponude.ponudjena_ukupna_cijena)/ ponude.ponudjena_ukupna_cijena) *
    (90)::numeric) + (((min(ponude.rok_isporuke) / ponude.rok_isporuke) *
    10))::numeric) AS bod_ukupno
FROM ponude 
GROUP BY 
  ponude.partija, 
  ponude.broj_tendera,
  ponude.atc,ponude.naziv_proizvoda,
   ponude.zasticeni_naziv,ponude.proizvodjac,ponude.farmaceutski_oblik,ponude.pakovanje,
     ponude.trazena_kolicina,ponude.ponudjana_kolicina, 
  ponude.procijenjena_jedinicna_cijena, 
  ponude.ponudjena_jedinicna_cijena, 
  ponude.procijenjena_ukupna_cijena, 
  ponude.ponudjena_ukupna_cijena, 
  ponude.rok_isporuke, 
  ponude.ponudjac, 
  ponude.broj_tendera
ORDER BY 
  ponude.partija;
