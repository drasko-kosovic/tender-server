package com.tender.controllers;

import java.util.List;

import com.tender.models.Jednostavne;
import com.tender.service.JednostavneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class JednostavneController {

	@Autowired
	private JednostavneService jednostavneService;

	@GetMapping("/ponude/jednostavne")
	public List<Jednostavne> findAllJednostavno() {
		List<Jednostavne> jednostavne = jednostavneService.findAllJednostavne();
		return jednostavne;
	}
}
