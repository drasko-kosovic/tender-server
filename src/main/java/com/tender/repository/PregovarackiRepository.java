package com.tender.repository;

import com.tender.models.Pregovaracki;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PregovarackiRepository extends JpaRepository<Pregovaracki, Integer> {

  

}
