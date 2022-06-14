package sanjiv.solid.design.bird;

import sanjiv.solid.design.behaviour.FlyableBird;
import sanjiv.solid.design.bird.impl.Crow;
import sanjiv.solid.design.bird.impl.CrowSparrowFlyingBehaviour;
import sanjiv.solid.design.bird.impl.Pigeon;
import sanjiv.solid.design.bird.impl.Sparrow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FlyableBird> flyableBirds = new ArrayList<>();
        FlyableBird crow = new Crow(2.5, "Crow","Black", new CrowSparrowFlyingBehaviour());
        FlyableBird sparrow = new Sparrow(6.7, "Sparrow","GWBMix", new CrowSparrowFlyingBehaviour());
        FlyableBird pigeon = new Pigeon(3.2, "Pigeon","Gray");
        flyableBirds.add(crow);
        flyableBirds.add(sparrow);
        flyableBirds.add(pigeon);

        System.out.println("No of diff types of flyable birds : "+flyableBirds.size());
    }
}
