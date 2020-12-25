package com.tender.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.tender.models.Bodovanje;
import com.tender.repository.BodovanjeRepository;
import com.tender.service.BodovanjeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BodovanjeaServiceImpl implements BodovanjeService {

    @Autowired
    BodovanjeRepository bodovanjeRepository;

    @Override
    public List<Bodovanje> findByTenderBodovanje(Integer broj_tendera) {

        return bodovanjeRepository.findByTenderBodovanje(broj_tendera);
    }

}
