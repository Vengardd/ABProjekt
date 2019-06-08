package com.vengard.aplikacje_bazodanowe_projekt.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Role_Permissions", joinColumns = {@JoinColumn(name = "ROLE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PRIVILEGE_ID")})
    private List<Privilege> privileges;

    public Role(long id) {
        this.id = id;
    }

    public boolean ifRoleHasPrivilege(Privilege privilege) {
        if(privileges.contains(privilege))
            return true;
        return false;
    }

}