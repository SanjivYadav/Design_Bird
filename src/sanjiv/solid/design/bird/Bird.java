package sanjiv.solid.design.bird;

public abstract class Bird {
    private final double weight;
    private final String type;
    private final String color;

    public Bird(double weight, String type, String color){
        this.weight = weight;
        this.type = type;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
    abstract public void eat();
    abstract public void makeSound();
}
