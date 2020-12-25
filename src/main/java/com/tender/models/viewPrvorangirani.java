package com.tender.models;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "view_prvorangirani")
public class viewPrvorangirani {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
    String broj_tendera;

}
