package com.tender.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ponude_jednostavne_pharm")
public class PonudeJednostavnePharm {

    Integer partija;
    String atc;
    String naziv_proizvoda;
    String zasticeni_naziv;
    String proizvodjac;
    String farmaceutski_oblik;
    String pakovanje;
    Integer trazena_kolicina;
    Integer ponudjana_kolicina;
    Double procijenjena_jedinicna_cijena;
    Double ponudjena_jedinicna_cijena;
    Double procijenjena_ukupna_cijena;
    Double ponudjena_ukupna_cijena;
    Integer rok_isporuke;
    String ponudjac;
    Integer broj_tendera;
    String broj_ugovora;
    Date datum_ugovora;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Boolean selected;

    public PonudeJednostavnePharm() {
    }





}
