package com.tender.service.impl;

import com.tender.models.Procijenjena;
import com.tender.repository.ProcijenjenaRepository;
import com.tender.service.ProcijenjenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProcijenjenaServiceImpl implements ProcijenjenaService {


	@Autowired
    ProcijenjenaRepository procijenjenaRepository;


    @Override
    public List<Procijenjena> AllProcijenjena()  {
        return procijenjenaRepository.findAll();
    }

//    @Override
//    public List<Procijenjena> Hvali() {
//        return procijenjenaRepository.Hvali();
//    }
}

