package com.tender.service;

import com.tender.models.Bodovanje;

import java.util.List;

public interface BodovanjeService {

	List<Bodovanje> findByTenderBodovanje(Integer broj_tendera);

}
