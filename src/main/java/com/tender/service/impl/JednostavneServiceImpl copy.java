package com.tender.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.tender.models.Jednostavne;
import com.tender.models.Pregovaracki;
import com.tender.repository.JednostavneRepository;
import com.tender.repository.PregovarackiRepository;
import com.tender.service.JednostavneService;
import com.tender.service.PregovarackiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JednostavneServiceImpl implements PregovarackiService {

    @Autowired
    PregovarackiRepository pregovarackiRepository;

    

    @Override
    public List<Pregovaracki> findAllPregovaracki() {
       
        return pregovarackiRepository.findAll();
    }

}
