package com.tender.controllers;

import java.util.List;

import com.tender.models.Jednostavne;
import com.tender.models.PonudeJednostavnePharm;
import com.tender.service.JednostavnePharmService;
import com.tender.service.JednostavneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class JednostavnePharmController {

	@Autowired
	private JednostavnePharmService jednostavnePharmService;

	@GetMapping("/ponude/pharm/jednostavne")
	public List<PonudeJednostavnePharm> findAllJednostavnePharm() {
		List<PonudeJednostavnePharm> jednostavne_pharm = jednostavnePharmService.findAllJednostavnePharm();
		return jednostavne_pharm;
	}
}
