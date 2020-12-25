package com.tender.controllers;

import java.util.List;

import com.tender.models.Prvorangirani;

import com.tender.service.PrvorangiraniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PrvorangiraniController {

	@Autowired
	private PrvorangiraniService viewPrvorangiraniService;

	@GetMapping("/ponude/tender/prvorangirani/{broj_tendera}")
	public List<Prvorangirani> findByBrojTenderaPrvorangirani(@PathVariable Integer broj_tendera) {
		List<Prvorangirani> prvorangirani = viewPrvorangiraniService.findByTenderPrvorangirani(broj_tendera);
		return prvorangirani;
	}
}
