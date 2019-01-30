package com.epam.learnspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class catServicePrimary implements CatInterface{
    @Override
    public String sayMeow() {
        return "meow from primary";
    }
}
