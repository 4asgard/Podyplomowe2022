package com.company.creatures;

public class FarmAnimal extends Animal{
    public FarmAnimal(String species, Double weight, String name){
        super(species);
        this.weight = weight;
        this.name = name;
    }

    public String toString() {
        return "FarmAnimal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
