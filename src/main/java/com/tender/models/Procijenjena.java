package com.tender.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "procijenjena")
public class Procijenjena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    Integer partija;
    // Integer atc;
    String naziv_proizvoda;
    String farmaceutski_oblik;
    String pakovanje;
    Integer trazena_kolicina;
    Double procijenjena_jedinicna_cijena;
    Double procijenjena_ukupna_cijena;
    Integer broj_tendera;

}
