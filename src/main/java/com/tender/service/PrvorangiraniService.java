package com.tender.service;

import java.util.List;

import com.tender.models.Prvorangirani;

public interface PrvorangiraniService {


	List<Prvorangirani> findByTenderPrvorangirani(Integer broj_tendera);

}
