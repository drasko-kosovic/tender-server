package com.tender.service;


import com.tender.models.Bodovanje;


import java.util.List;


public interface BodovanjeService {


    public List<Bodovanje> AllBodovanje();

    public List<Bodovanje> PrvorangiraniPonudjaci();

    public List<Bodovanje> findBodovanjeByBrojTendera(String broj_tendera);

	public List<Bodovanje> prvorangiraniPonudjaciByBrojTendera(String broj_tendera) ;

}
