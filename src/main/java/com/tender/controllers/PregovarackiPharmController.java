package com.tender.controllers;

import java.util.List;
import com.tender.models.PonudePergovarackiPharm;
import com.tender.service.PregovarackiPharmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PregovarackiPharmController {
	@Autowired

	private PregovarackiPharmService pregovarackiPharmService;

	@GetMapping("/ponude/pharm/pregovaracki")
	public List<PonudePergovarackiPharm> findAllPregovarackiPharm() {
		List<PonudePergovarackiPharm> pregovaracki_pharm = pregovarackiPharmService.findAllPregovarackiPharm();
		return pregovaracki_pharm;
	}
}
