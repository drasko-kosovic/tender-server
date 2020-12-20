package com.tender.repository;

import com.tender.models.Ponude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PonudeRepository extends JpaRepository<Ponude, Integer> {

        // List<Ponude> findByPonudjac(String ponudjac);

        @Query(value = " SELECT * FROM Ponude p WHERE p.broj_tendera=:broj_tendera", nativeQuery = true)
        List<Ponude> findByBroj_tendera(Integer broj_tendera);

        @Query(value = " SELECT * FROM Ponude p WHERE p.broj_tendera=:broj_tendera and p.ponudjac=:ponudjac", nativeQuery = true)
        List<Ponude> findByBrojTenderaPonudjac(Integer broj_tendera, String ponudjac);

        @Query(value = " SELECT * FROM ponude", nativeQuery = true)
        List<Ponude> All();

        @Query(value = " SELECT * FROM Ponude p WHERE p.ponudjena_ukupna_cijena  > p.procijenjena_ukupna_cijena and p.broj_tendera=:broj_tendera", nativeQuery = true)
        List<Ponude> PrekoProcijenjeneByBrojTendera(Integer broj_tendera);

        @Modifying
        @Query("DELETE from Ponude p WHERE p.selected = true")
        void deleteBySelected();

        @Modifying
        @Query("UPDATE Ponude p SET p.selected=true WHERE p.id = :Id")
        void updateSlected(@Param("Id") int Id);

}
