package com.tender.repository;

import com.tender.models.Jednostavne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JednostavneRepository extends JpaRepository<Jednostavne, Integer> {

  

}
