package com.company.creatures;

public abstract class Animal implements Edbile, Feedable{
    public final String species;
    public Double weight;
    public Integer age;
    public String name;
    Boolean isAlive;

    static private final Double DEFAULT_CAT_WEIGHT = 2.0;
    static private final Double DEFAULT_DOG_WEIGHT = 10.0;
    static public Double DEFAULT_WEIGHT = 5.0;


    public Animal(String species){
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch(this.species)    {
//            case "felis":this.weight = 2.0; break;
            case "felis":this.weight = DEFAULT_CAT_WEIGHT; break;
//            case "canis":this.weight = 10.0; break;
            case "canis":this.weight = DEFAULT_DOG_WEIGHT; break;
//            default:this. weight = 5.0; break;
            default:this. weight = DEFAULT_WEIGHT; break;
        }
    }

    @Override
    public void feed(){
        weight += 1.0;
        System.out.println("thx for food");
    }

    public void feed(Double foodWeight){
        System.out.println("djfdjf");
    }

     void takeForAWalk(){
        if(isAlive){
            weight -= 1.0;
            System.out.println("nice walk, thx");
            if(weight <= 0.0)   {
                isAlive = false;
            }
        }
        else {
            System.out.println("Halo policja, ktoś targa martwe zwierzę po chodniku");
        }

        /*
        if (weight == 0.0)  {
            System.out.println("died");
        }
        else    {
            weight -= 1.0;
            System.out.println("nice walk , thx");
        }
         */
    }

    public abstract String toString();
}