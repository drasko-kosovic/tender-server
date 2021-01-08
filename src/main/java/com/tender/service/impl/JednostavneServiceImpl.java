package com.tender.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.tender.models.Jednostavne;
import com.tender.repository.JednostavneRepository;
import com.tender.service.JednostavneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JednostavneServiceImpl implements JednostavneService {

    @Autowired
    JednostavneRepository jednostavneRepository;

    @Override
    public List<Jednostavne> findAllJednostavne() {

        return jednostavneRepository.findAll();
    }

}
