package com.tender.repository;

import com.tender.models.Procijenjena;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcijenjenaRepository extends JpaRepository<Procijenjena, Integer> {

        // @Query(value = " SELECT * FROM Ponude p WHERE p.ponudjena_ukupna_cijena  > p.procijenjena_ukupna_cijena and p.broj_tendera=:broj_tendera", nativeQuery = true)
        // List<Procije> PrekoProcijenjeneByBrojTendera(Integer broj_tendera);
     

}
