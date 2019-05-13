package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int availableAmount;
    //ToDo map
    private Type type;
    private Producer producer;

}
