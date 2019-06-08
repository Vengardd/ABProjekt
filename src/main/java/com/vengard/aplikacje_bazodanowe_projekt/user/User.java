package com.vengard.aplikacje_bazodanowe_projekt.user;

import com.vengard.aplikacje_bazodanowe_projekt.dao.Role;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String password;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @Enumerated(EnumType.ORDINAL)
    private Role role;

    public static final class UserBuilder {
        private long id;
        private String name;
        private String surname;
        private String password;
        private String email;
        //    @OneToOne(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //    @JoinColumn(name = "id")
        private Role role;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withRole(Role role) {
            this.role = role;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(id);
            user.setName(name);
            user.setSurname(surname);
            user.setPassword(password);
            user.setEmail(email);
            user.setRole(role);
            return user;
        }
    }
}
