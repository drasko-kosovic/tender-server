package com.tender.service.impl;
import java.util.List;
import javax.transaction.Transactional;
import com.tender.models.PonudeJednostavnePharm;
import com.tender.repository.JednostavnePharmRepository;
import com.tender.service.JednostavnePharmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class JednostavnePharmServiceImpl implements JednostavnePharmService {
    @Autowired
    JednostavnePharmRepository jednostavneParmRepository;
    @Override
    public List<PonudeJednostavnePharm> findAllJednostavnePharm() {
        return jednostavneParmRepository.findAll();
    }
}
