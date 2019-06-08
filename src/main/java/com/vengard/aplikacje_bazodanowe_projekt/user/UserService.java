package com.vengard.aplikacje_bazodanowe_projekt.user;

import com.vengard.aplikacje_bazodanowe_projekt.dao.Role;
import com.vengard.aplikacje_bazodanowe_projekt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private Optional<User> loggedUser;

    @Autowired
    private UserRepository userRepository;

    public User loginUser(UserToLogin user) {
        Optional<User> foundUser = userRepository.findByEmail(user.getEmail());
        if (!foundUser.isPresent() || !foundUser.get().getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Błędny email lub hasło");
        }
        return foundUser.get();
    }

    public void registerUser(UserToRegister user) {
        if(userRepository.findByEmail(user.getEmail()).isPresent())
            throw new RuntimeException("Użytkownik już istnieje");
        User newUser = User.UserBuilder.anUser()
                .withEmail(user.getEmail())
                .withPassword(user.getPassword())
                .withRole(new Role(1L))
                .build();
        userRepository.save(newUser);
    }

    public User getLoggedUser() {
        return loggedUser.orElseThrow(() -> new RuntimeException("No user is logged"));
    }

    public void logout() {
        this.loggedUser = Optional.empty();
    }

}
