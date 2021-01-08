package com.tender.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jednostavne")
public class Jednostavne {

    
    String atc;
    String naziv_proizvoda;
    Integer trazena_kolicina;
    Integer ponudjana_kolicina;
    Double procijenjena_jedinicna_cijena;
    Double ponudjena_jedinicna_cijena;
    Double procijenjena_ukupna_cijena;
    Double ponudjena_ukupna_cijena;
    String ponudjac;
    Integer broj_jednostavne;
    String broj_ugovora_odluka;
    Date datum_ugovora_odluke;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Boolean selected;

    public Jednostavne() {
    }


    


}
