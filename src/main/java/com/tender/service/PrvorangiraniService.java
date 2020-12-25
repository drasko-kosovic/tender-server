package com.tender.service;

import com.tender.models.viewPrvorangirani;

import java.util.List;

public interface PrvorangiraniService {


	List<viewPrvorangirani> findByTenderPrvorangirani(Integer broj_tendera);

}
