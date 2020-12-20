package com.tender.service.impl;

import com.tender.models.Ponude;
import com.tender.repository.PonudeRepository;
import com.tender.service.PonudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PonudeServiceImpl implements PonudeService {

    @Autowired
    PonudeRepository ponudeRepository;

    @Override
    public Page<Ponude> findAll(Pageable pageable) {
        return ponudeRepository.findAll(pageable);
    }

    @Override
    public List<Ponude> All() {
        return ponudeRepository.All();
    }

    // @Override
    // public List<Ponude> findByBrojTendera(String broj_tendera) {
    // return ponudeRepository.findByBroj_tendera(broj_tendera);
    // }

    // @Override
    // public List<Ponude> findBrojTenderaPonudac(String broj_tendera, String
    // ponudjac) {
    // return ponudeRepository.findByBrojTenderaPonudjac(broj_tendera, ponudjac);
    // }

    @Override
    public List<Ponude> PrekoProcijenjeneByBrojTendera(Integer brojTendera) {
        return ponudeRepository.PrekoProcijenjeneByBrojTendera(brojTendera);
    }

    @Override
    public List<Ponude> findBrojTenderaPonudac(Integer broj_tendera, String ponudjac) {

        return ponudeRepository.findByBrojTenderaPonudjac(broj_tendera, ponudjac);
    }

    @Override
    public Ponude add(Ponude ponude) {
        return this.ponudeRepository.save(ponude);
    }

    @Override
    public Optional<Ponude> update(Ponude ponude) {
        Optional<Ponude> PonudeOpt = ponudeRepository.findById(ponude.getId());

        if (PonudeOpt.isPresent()) {
            Ponude existingPonude = PonudeOpt.get();

            if (ponude.getPartija() != null) {
                existingPonude.setPartija(ponude.getPartija());
            }

            if (ponude.getAtc() != null) {
                existingPonude.setAtc(ponude.getAtc());
            }

            if (ponude.getNaziv_proizvoda() != null) {
                existingPonude.setNaziv_proizvoda(ponude.getNaziv_proizvoda());
            }

            if (ponude.getZasticeni_naziv() != null) {
                existingPonude.setZasticeni_naziv(ponude.getZasticeni_naziv());
            }

            if (ponude.getProizvodjac() != null) {
                existingPonude.setProizvodjac(ponude.getProizvodjac());
            }

            if (ponude.getFarmaceutski_oblik() != null) {
                existingPonude.setFarmaceutski_oblik(ponude.getFarmaceutski_oblik());
            }

            if (ponude.getPakovanje() != null) {
                existingPonude.setPakovanje(ponude.getPakovanje());
            }

            if (ponude.getTrazena_kolicina() != null) {
                existingPonude.setTrazena_kolicina(ponude.getTrazena_kolicina());
            }

            if (ponude.getPonudjana_kolicina() != null) {
                existingPonude.setPonudjana_kolicina(ponude.getPonudjana_kolicina());
            }

            if (ponude.getProcijenjena_jedinicna_cijena() != null) {
                existingPonude.setProcijenjena_jedinicna_cijena(ponude.getProcijenjena_jedinicna_cijena());
            }

            if (ponude.getPonudjena_jedinicna_cijena() != null) {
                existingPonude.setPonudjena_jedinicna_cijena(ponude.getProcijenjena_ukupna_cijena());
            }

            if (ponude.getProcijenjena_ukupna_cijena() != null) {
                existingPonude.setProcijenjena_ukupna_cijena(ponude.getProcijenjena_ukupna_cijena());
            }

            if (ponude.getPonudjena_ukupna_cijena() != null) {
                existingPonude.setPonudjena_ukupna_cijena(ponude.getPonudjena_ukupna_cijena());
            }

            if (ponude.getRok_isporuke() != null) {
                existingPonude.setRok_isporuke(ponude.getRok_isporuke());
            }

            if (ponude.getPonudjac() != null) {
                existingPonude.setPonudjac(ponude.getPonudjac());
            }

            if (ponude.getBroj_tendera() != null) {
                existingPonude.setBroj_tendera(ponude.getBroj_tendera());
            }
            if (ponude.getBroj_ugovora() != null) {
                existingPonude.setBroj_ugovora(ponude.getBroj_ugovora());
            }

            ponudeRepository.save(existingPonude);

            return Optional.of(existingPonude);
        }

        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

        ponudeRepository.deleteById(id);
    }

    @Override
    public void deleteSelected() {
        ponudeRepository.deleteBySelected();
    }

    @Override
    public void updatePonudeSelected(int id) {
        {
            ponudeRepository.updateSlected(id);
        }
    }

    @Override
    public List<Ponude> findByBrojTendera(Integer broj_tendera) {

        return ponudeRepository.findByBroj_tendera(broj_tendera);
    }

}
