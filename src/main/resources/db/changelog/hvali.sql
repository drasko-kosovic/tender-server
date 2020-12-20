CREATE OR REPLACE FUNCTION public.hvali
(
  IN  broj_tender  numeric
)
RETURNS SETOF public.procijenjena AS
$$
SELECT
 *
FROM procijenjena
WHERE
  (
    (
      (procijenjena.broj_tendera) = broj_tendera
    ) AND
    (
      NOT (
        procijenjena.partija IN ( SELECT
          view_bodovanje.partija
        FROM view_bodovanje
        WHERE
          (
            (view_bodovanje.broj_tendera) = broj_tendera
          ))
      )
    )
  );
$$
LANGUAGE 'sql'
COST 100;

