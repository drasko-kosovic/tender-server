package com.tender.models;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "hvale_partije")
public class Hvale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    Integer partija;
   
    String naziv_proizvoda;
    String farmaceutski_oblik;
    String pakovanje;
    Integer trazena_kolicina;
    Double procijenjena_jedinicna_cijena;
    Double procijenjena_ukupna_cijena;
    Integer broj_tendera;

    
   

   
}
