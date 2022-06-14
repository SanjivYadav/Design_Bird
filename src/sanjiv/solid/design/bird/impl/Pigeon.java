package sanjiv.solid.design.bird.impl;


import sanjiv.solid.design.behaviour.FlyableBird;
import sanjiv.solid.design.bird.Bird;

public class Pigeon extends Bird implements FlyableBird {

    public Pigeon(double weight, String type, String color){
        super(weight,type,color);
    }
    @Override
    public void fly() {
        System.out.println("Pigeon can fly");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon can make sound");
    }
}
