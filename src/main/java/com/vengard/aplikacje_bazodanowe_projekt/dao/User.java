package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "userr")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String password;

    @OneToOne(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Role role;

}
