package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIstheBest(){
        return petService.getPetType();
    }


}
