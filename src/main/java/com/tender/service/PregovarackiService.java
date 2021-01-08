package com.tender.service;

import java.util.List;

import com.tender.models.Jednostavne;
import com.tender.models.Pregovaracki;
import com.tender.models.Prvorangirani;

public interface PregovarackiService {


	List<Pregovaracki> findAllPregovaracki();

}
