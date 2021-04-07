package com.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//default profile
@Profile({"ES","default"})
//@Profile("ES")
@Service("i18NService")
public class I18NSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
