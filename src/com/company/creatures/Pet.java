package com.company.creatures;

public class Pet extends Animal{
    public Pet(String species){
        super(species);
        this.weight = weight;
        this.name = name;
    }

    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
