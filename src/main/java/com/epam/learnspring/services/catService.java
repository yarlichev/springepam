package com.epam.learnspring.services;

import org.springframework.stereotype.Service;

@Service
public class catService implements CatInterface {
    @Override
    public String sayMeow() {
        return "meow";
    }
}
