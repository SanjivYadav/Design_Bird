package sanjiv.solid.design.bird.impl;

import sanjiv.solid.design.behaviour.FlyableBird;
import sanjiv.solid.design.behaviour.FlyingBehaviour;
import sanjiv.solid.design.bird.Bird;

public class Sparrow extends Bird implements FlyableBird {
    private FlyingBehaviour fb;

    public Sparrow(double weight, String type, String color, FlyingBehaviour fb){
        super(weight, type, color);
        this.fb = fb;
    }

    @Override
    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Sparrow can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow can make sound");
    }
}
