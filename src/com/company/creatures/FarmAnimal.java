package com.company.creatures;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
        this.name = name;
    }

    public String toString() {
        return this.species + " " + this.name;
    }
}
