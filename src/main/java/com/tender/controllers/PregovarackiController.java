package com.tender.controllers;

import java.util.List;

import com.tender.models.Pregovaracki;
import com.tender.service.PregovarackiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PregovarackiController {

	@Autowired
	private PregovarackiService pregovarackiService;

	@GetMapping("/ponude/pregovaracki")
	public List<Pregovaracki> findAllPregovaracki() {
	List<Pregovaracki> pregovaracki = pregovarackiService.findAllPregovaracki();
	return pregovaracki;
	}
}
