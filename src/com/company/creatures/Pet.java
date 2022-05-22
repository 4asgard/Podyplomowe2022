package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
        this.name = name;
    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() {
        System.out.println("www");
    }

    @Override
    public void feed(Double foodWeight) {

    }
}
