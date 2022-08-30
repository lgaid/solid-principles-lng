package com.cydeo.solid.interfaceSegregation.example.good;

import com.cydeo.solid.interfaceSegregation.example.bad.Bird;
import com.cydeo.solid.interfaceSegregation.example.bad.Chicken;
import com.cydeo.solid.interfaceSegregation.example.bad.Eagle;
import com.cydeo.solid.interfaceSegregation.example.bad.Owl;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        List<com.cydeo.solid.interfaceSegregation.example.bad.Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);

    }

    public static void letBirdsFly(List<com.cydeo.solid.interfaceSegregation.example.bad.Bird> birds) {
        for (Bird bird : birds) {
            bird.fly();     // Does nothing for chicken
        }
    }

}
