package com.tender.service.impl;

import java.util.List;
import javax.transaction.Transactional;

import com.tender.models.PonudePergovarackiPharm;
import com.tender.repository.PregovarackiPharmRepository;
import com.tender.service.PregovarackiPharmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
 public class PregovarackiPharmServiceImpl implements PregovarackiPharmService {

    @Autowired
    PregovarackiPharmRepository pregovarackiPharmRepository;
    @Override
    public List<PonudePergovarackiPharm> findAllPregovarackiPharm() {
        return this.pregovarackiPharmRepository.findAll();
    }
}
