package com.vengard.aplikacje_bazodanowe_projekt.service;

import com.vengard.aplikacje_bazodanowe_projekt.dao.*;
import com.vengard.aplikacje_bazodanowe_projekt.repository.*;
import com.vengard.aplikacje_bazodanowe_projekt.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Lab11Service {

    @Autowired
    private AccessoryRepository accessoryRepository;
    @Autowired
    private InstrumentRepository instrumentRepository;
    @Autowired
    private PrivilegeRepository privilegeRepository;
    @Autowired
    private ProducerRepository producerRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private SheetMusicRepository sheetMusicRepository;
    @Autowired
    private TypeRepository typeRepository;
    @Autowired
    private UserRepository userRepository;

    public void showAllTables() {
        //Not showing M:M tables like Role-Privilege and SheetMusic-Type
        for (Accessory a :
                accessoryRepository.findAll()) {
            System.out.println(a);
        }
        for (Instrument i :
                instrumentRepository.findAll()) {
            System.out.println(i);
        }
        for (Privilege p :
                privilegeRepository.findAll()) {
            System.out.println(p);
        }
        for (Producer p :
                producerRepository.findAll()) {
            System.out.println(p);
        }
        for (Role r :
                roleRepository.findAll()) {
            System.out.println(r);
        }
        for (SheetMusic s :
                sheetMusicRepository.findAll()) {
            System.out.println(s);
        }
        for (Type t :
                typeRepository.findAll()) {
            System.out.println(t);
        }
        for (User u :
                userRepository.findAll()) {
            System.out.println(u);
        }
    }
}
