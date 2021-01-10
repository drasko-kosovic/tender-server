package com.tender.repository;

import com.tender.models.PonudeJednostavnePharm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JednostavnePharmRepository extends JpaRepository<PonudeJednostavnePharm, Integer> {



}
