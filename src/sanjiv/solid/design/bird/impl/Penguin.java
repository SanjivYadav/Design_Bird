package sanjiv.solid.design.bird.impl;

import sanjiv.solid.design.bird.Bird;

public class Penguin extends Bird {

    public Penguin(double weight, String type, String color){
        super(weight, type, color);
    }
    @Override
    public void eat() {
        System.out.println("Penguin can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin can make sound");
    }
}
