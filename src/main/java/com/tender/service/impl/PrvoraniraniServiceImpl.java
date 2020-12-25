package com.tender.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.tender.models.Prvorangirani;
import com.tender.repository.PrvorangiraniRepository;
import com.tender.service.PrvorangiraniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PrvoraniraniServiceImpl implements PrvorangiraniService {

    @Autowired
    PrvorangiraniRepository prvorangiraniRepository;

    @Override
    public List<Prvorangirani> findByTenderPrvorangirani(Integer broj_tendera) {
        return prvorangiraniRepository.findBrojTenderaPrvorangirani(broj_tendera);
    }

    

}
