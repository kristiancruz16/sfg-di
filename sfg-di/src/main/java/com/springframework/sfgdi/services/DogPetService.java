package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dogs","default"})
@Service("petService")
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
