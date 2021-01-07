package com.tender.controllers;

import com.tender.models.Ponude;

import com.tender.service.PonudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PonudeController {

    @Autowired
    private PonudeService ponudeService;

    @GetMapping("/ponude/all")
    public ResponseEntity<Page<Ponude>> findAll(Pageable pageable) {
        return new ResponseEntity<Page<Ponude>>(ponudeService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/ponude")
    public List<Ponude> allPonude() {

        List<Ponude> ponude = ponudeService.All();
        return ponude;
    }

    @GetMapping("/ponude/tender/{brojTendera}")
    public List<Ponude> findByBrojTendera(@PathVariable Integer brojTendera) {
        List<Ponude> ponude = ponudeService.findByBrojTendera(brojTendera);
        return ponude;

    }

    @GetMapping(value = "/ponude/tender/{broj_tendera}/{ponudjac}")
    public List<Ponude> ponudeBrojPonudjac(@PathVariable Integer broj_tendera, @PathVariable String ponudjac) {
        List<Ponude> ponude = ponudeService.findBrojTenderaPonudac(broj_tendera, ponudjac);
        return ponude;
    }

    @GetMapping("/ponude/tender/preko_procijenjene/{broj_tendera}")
    public List<Ponude> findPrekoProcijenjeneByBrojTendera(@PathVariable Integer broj_tendera) {
        List<Ponude> preko_procijenjene = ponudeService.PrekoProcijenjeneByBrojTendera(broj_tendera);
        return preko_procijenjene;

    }

    @PutMapping("/ponude/update")
    public ResponseEntity<Ponude> update(@RequestBody Ponude ponude) {
        Optional<Ponude> optPonude = ponudeService.update(ponude);

        if (optPonude.isPresent()) {
            return new ResponseEntity<Ponude>(optPonude.get(), HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/ponude/delete/{id}")
    public void delete(@PathVariable Integer id) {
        ponudeService.delete(id);
    }

    @PostMapping("/ponude/add")
    public ResponseEntity<Ponude> add(@Valid @RequestBody Ponude ponude) {
        ponudeService.add(ponude);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/ponude/delete/selected")
    public void delete() {
        ponudeService.deleteSelected();

    }

    @PutMapping("/ponude/update/selected/{id}")
    public void updatePonude(@PathVariable("id") int id) {
        ponudeService.updatePonudeSelected(id);
    }

    @PutMapping("/ponude/update/ugovor")
    void addUgovor(@RequestParam Integer broj_tendera, String ponudjac) {
        this.ponudeService.addUgovor(broj_tendera, ponudjac);
    }

}
