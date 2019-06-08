package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int availableAmount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Type type;
    @ManyToOne(fetch = FetchType.EAGER)
    private Producer producer;

}
