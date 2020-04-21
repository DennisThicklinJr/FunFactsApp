package com.example.dennisthicklin.funfactsapp;

import java.util.Random;



public class FactBook {
    private String[] facts = {"Tyler1 is 6'5",
            "Dennis is a USF student",
            "1 + 1 = 2",
            "Big Shaq is the best rapper alive.",
            "Java is a programming language."};



    public String getFact(){
        Random random = new Random();
        return facts[random.nextInt(facts.length)];
    }
}
