package com.tender.controllers;

import java.util.List;

import com.tender.models.Bodovanje;
import com.tender.service.BodovanjeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BodovanjeController {

	@Autowired
	private BodovanjeService bodovanjeService;

	@GetMapping("/ponude/bodovanje/{broj_tendera}")
	public List<Bodovanje> findByBrojTenderaBodovanje(@PathVariable Integer broj_tendera) {
		List<Bodovanje> bodovanje = bodovanjeService.findByTenderBodovanje(broj_tendera);
		return bodovanje;
	}

	@GetMapping("/ponude/tender/prvorangirani/{broj_tendera}")
	public List<Bodovanje> findByBrojTenderaPrvorangirani(@PathVariable Integer broj_tendera) {
		List<Bodovanje> prvorangirani = bodovanjeService.findByTenderPrvorangirani(broj_tendera);
		return prvorangirani;
	}
}
