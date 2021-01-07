package com.tender.service;

import com.tender.models.Ponude;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PonudeService {

	public Page<Ponude> findAll(Pageable pageable);

	public List<Ponude> All();

	public List<Ponude> findByBrojTendera(Integer broj_tendera);

	public List<Ponude> findBrojTenderaPonudac(Integer broj_tendera, String ponudjac);

	public List<Ponude> PrekoProcijenjeneByBrojTendera(Integer broj_tendera);

	public Ponude add(Ponude ponude);

	public Optional<Ponude> update(Ponude ponude);

	void delete(Integer id);

	public void deleteSelected();

	public void updatePonudeSelected(int id);

	public void addUgovor(String broj_ugovora,Integer broj_tendera, String ponudjac);

}
