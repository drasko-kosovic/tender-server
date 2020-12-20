package com.tender.controllers;


import com.tender.models.Bodovanje;
import com.tender.service.BodovanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BodovanjeController {

	@Autowired
	private BodovanjeService bodovanjeService;


	@GetMapping("/ponude/bodovanje")
	public List<Bodovanje> findAllBodovanje() {
		return  bodovanjeService.AllBodovanje();
	}


    @GetMapping("/ponude/prvorangirani")
    public List<Bodovanje> prvorangiraniPonudjaci() {
        return  bodovanjeService.PrvorangiraniPonudjaci();
    }

	@GetMapping("/ponude/bodovanje/{broj_tendera}")
	public List findByBrojTendera(@PathVariable String broj_tendera) {
		List<Bodovanje> bodovanje = bodovanjeService.findBodovanjeByBrojTendera(broj_tendera);
		return  bodovanje;

	}

	@GetMapping("/ponude/prvorangirani/{broj_tendera}")
	public List findPrvorangiraniByBrojTendera(@PathVariable String broj_tendera) {
		List<Bodovanje> prvorangirani = bodovanjeService.prvorangiraniPonudjaciByBrojTendera(broj_tendera);
		return  prvorangirani;

	}
}
