package com.tenderi;


import com.tender.repository.BodovanjeRepository;
import com.tender.repository.HvaleRepository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TenderiApplicationTests {

	HvaleRepository hvaleRepository;
	BodovanjeRepository bodovanjeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void bodovanje() {
	System.out.println(bodovanjeRepository.findByTenderBodovanje(1020));

	}

}
