package com.tender.repository;

import java.util.List;

import com.tender.models.viewPrvorangirani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrvorangiraniRepository extends JpaRepository<viewPrvorangirani, Integer> {

  @Query(value = "SELECT * FROM view_prvorangirani u WHERE u.broj_tendera = :broj_tendera", nativeQuery = true)
  List<viewPrvorangirani> findBrojTenderaPrvorangirani(@Param("broj_tendera") Integer broj_tendera);

}
