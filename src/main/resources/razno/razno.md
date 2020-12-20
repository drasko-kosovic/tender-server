http://localhost:8080/api/search?criteria=ponudjac&searchItem=glosarij

1	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1	0.98	784.00	784.00	4	glosarij	0120


1	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin  	galenika	pak	800	800	0.95	0.93	784.00	784.00	4	glosarij	0220
2	1	A01A	andolin	tidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	0.95	0.94	784.00	700.00	10	farmont	0220
3	2	A01AB12	rastvor x	Stomat (1mg/ml)	bayer	pak	520	520	1.20	1.10	450.00	420.00	4	farmalab	0220
4	2	A01AB12	heksetidin rastvor x za usnu sluzokožu 1mg/ml (200ml)	amraka 1 x 200ml (1mg/ml)	medik	pak	520	520	1.20	1.20	450.00	400.00	9	farmegra	0220



1	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	784.00	784.00	4	glosarij	0120
4	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	500.00	400.00	1	medica	0120
2	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	784.00	450.00	2	farmegra	0120
3	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	500.00	421.00	10	farmont	0120



select partija, MIN(ponudjena_ukupna_cijena ) AS najmanja_cijena, broj_tendera
FROM public.ponude
GROUP BY partija, broj_tendera
ORDER BY partija


d


1	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	784.00	784.00	4	glosarij	0120
3	2	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	500.00	421.00	10	farmont	0120
2	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	784.00	700.00	2	farmegra	0120
4	2	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	1.00	0.98	500.00	400.00	1	medica	0120
5	1	A01AB12	heksetidin rastvor za usnu sluzokožu 1mg/ml (200ml)	Stomatidin  	galenika	pak	800	800	0.95	0.93	200.00	200.00	4	glosarij	0220
8	2	A01AB12	heksetidin rastvor x za usnu sluzokožu 1mg/ml (200ml)	amraka 1 x 200ml (1mg/ml)	medik	pak	520	520	1.20	1.20	250.00	300.00	9	farmegra	0220
7	2	A01AB12	rastvor x	Stomat (1mg/ml)	bayer	pak	520	520	1.20	1.10	350.00	340.00	4	farmalab	0220
6	1	A01A	andolin	tidin 1 x 200ml (1mg/ml)	Bosnalijek	pak	800	800	0.95	0.94	200.00	185.00	10	farmont	0220

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

select partija, MIN(ponudjena_ukupna_cijena ) AS najmanja_cijena, MAX(ponudjena_ukupna_cijena ) AS najveca_cijena,(MIN(ponudjena_ukupna_cijena )/MAX(ponudjena_ukupna_cijena ))*100 as bod,
broj_tendera
FROM public.ponude where broj_tendera='0120'
GROUP BY partija, broj_tendera
ORDER BY partija
///////////////////////////////////////// nema ponuda
SELECT 
  procijenjena.id, 
  procijenjena.partija, 
  procijenjena.atc, 
  procijenjena.naziv_proizvoda, 
  procijenjena.farmaceutski_oblik, 
  procijenjena.pakovanje, 
  procijenjena.trazena_kolicina, 
  procijenjena.procijenjena_jedinicna_cijena, 
  procijenjena.procijenjena_ukupna_cijena, 
  procijenjena.broj_tendera 
FROM procijenjena 
WHERE
  (
    (
      (procijenjena.broj_tendera) = '1020'
    ) AND
    (
      NOT (
        procijenjena.partija IN ( SELECT 
          bodovanje.partija 
        FROM bodovanje 
        WHERE
          (
            (bodovanje.broj_tendera) = '1020'
          ))
      )
    )
  );
