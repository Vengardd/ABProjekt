package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int availableAmount;

    @OneToMany
    private List<Type> compatibleInstruments;

}
