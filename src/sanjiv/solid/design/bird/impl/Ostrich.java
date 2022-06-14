package sanjiv.solid.design.bird.impl;

import sanjiv.solid.design.bird.Bird;

public class Ostrich extends Bird {

    public Ostrich(double weight, String type, String color){
        super(weight, type, color);
    }
    @Override
    public void eat() {
        System.out.println("Ostrich can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich can make sound");
    }
}
