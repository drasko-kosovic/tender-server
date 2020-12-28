package com.tender.repository;

import java.util.List;

import com.tender.models.Prvorangirani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrvorangiraniRepository extends JpaRepository<Prvorangirani, Integer> {

  @Query(value = "SELECT * FROM view_prvorangirani WHERE broj_tendera = :broj_tendera ORDER BY partija ASC", nativeQuery = true)
  List<Prvorangirani> findBrojTenderaPrvorangirani(@Param("broj_tendera") Integer broj_tendera);

}
