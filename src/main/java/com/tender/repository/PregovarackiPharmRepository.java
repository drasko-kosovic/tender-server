package com.tender.repository;

import com.tender.models.PonudePergovarackiPharm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PregovarackiPharmRepository extends JpaRepository<PonudePergovarackiPharm, Integer> {



}
