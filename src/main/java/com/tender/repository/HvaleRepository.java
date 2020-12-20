package com.tender.repository;

import java.util.List;

import com.tender.models.Hvale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HvaleRepository extends JpaRepository<Hvale, Integer> {

    @Query(value = "SELECT * FROM hvale_partije u WHERE u.broj_tendera = :broj_tendera", 
    nativeQuery = true)
  List<Hvale>findBrojTenderaHvli(@Param("broj_tendera") Integer broj_tendera);


//   @Query(value = "SELECT * FROM hvali(:broj_tendera) ", 
//   nativeQuery = true)
// List<Hvale>findBrojTenderaHvliFn(@Param("broj_tendera") Integer broj_tendera);
    

}
