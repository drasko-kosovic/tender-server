package com.tender.repository;

import com.tender.models.Bodovanje;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BodovanjeRepository extends JpaRepository<Bodovanje, Integer> {

        @Query(value = " SELECT * from view_bodovanje  where broj_tendera=:broj_tendera and bod_ukupno=100 ", nativeQuery = true)

        List<Bodovanje> findByTenderPrvorangirani(Integer broj_tendera);

        @Query(value = " SELECT * from view_bodovanje  where broj_tendera=:broj_tendera ", nativeQuery = true)

        List<Bodovanje> findByTenderBodovanje(Integer broj_tendera);
}
