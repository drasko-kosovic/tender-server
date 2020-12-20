package com.tender.controllers;

import java.util.List;

import com.tender.models.Hvale;
import com.tender.repository.HvaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class HvaliController {

	@Autowired
	private HvaleRepository hvaleRepository;

	@GetMapping("/ponude/hvali/{broj_tendera}")
	public List<Hvale> Hvali(@PathVariable Integer broj_tendera) {
		return hvaleRepository.findBrojTenderaHvli(broj_tendera);
	}

}
