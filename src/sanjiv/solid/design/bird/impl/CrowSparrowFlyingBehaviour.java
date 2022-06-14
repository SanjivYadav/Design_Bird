package sanjiv.solid.design.bird.impl;

import sanjiv.solid.design.behaviour.FlyingBehaviour;

public class CrowSparrowFlyingBehaviour implements FlyingBehaviour {

    @Override
    public void makeFly() {
        System.out.println("Crow and Sparrow are flying in the same way");
    }
}
