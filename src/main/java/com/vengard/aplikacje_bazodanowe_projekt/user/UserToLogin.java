package com.vengard.aplikacje_bazodanowe_projekt.user;

import lombok.Data;

@Data
public class UserToLogin {

    private String email;
    private String password;

    public UserToLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
