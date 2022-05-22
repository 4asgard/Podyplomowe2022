package com.company.creatures;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
        this.name = name;
    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed() {
        System.out.println("rrr");
    }

    @Override
    public void feed(Double foodWeight) {

    }
}
