package com.tender.service.impl;

import com.tender.models.Bodovanje;
import com.tender.models.Ponude;
import com.tender.repository.BodovanjeRepository;
import com.tender.service.BodovanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BodovanjeServiceImpl implements BodovanjeService {


	@Autowired
    BodovanjeRepository bodovanjeRepository;

    @Override
    public List<Bodovanje> AllBodovanje() {
	    return bodovanjeRepository.findAll();
        }

    @Override
    public List<Bodovanje> PrvorangiraniPonudjaci() {
        { return bodovanjeRepository.prvorangiraniPonudjaci();
        }

    }

    @Override
    public List<Bodovanje> findBodovanjeByBrojTendera(String broj_tendera)
    {
        List<Bodovanje>bodovanje=bodovanjeRepository.findByBroj_tendera(broj_tendera);
        return  bodovanje;
    }

    @Override
    public List<Bodovanje> prvorangiraniPonudjaciByBrojTendera(String broj_tendera) {
        List<Bodovanje>prvorangirani=bodovanjeRepository.prvorangiraniPonudjaciByBrojTendera(broj_tendera);
        return  prvorangirani;
    }


}

