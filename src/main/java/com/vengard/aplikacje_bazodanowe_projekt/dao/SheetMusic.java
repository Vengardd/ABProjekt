package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class SheetMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(name = "SheetMusicInstrument",
            joinColumns = {@JoinColumn(name = "Sheet_Music_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Type_Id")})
    private List<Type> typesOfInstrument;
}
