package com.company;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Human Agnieszka = new Human();
        Agnieszka.getSalary();
        Agnieszka.setSalary(15000.0);

        Agnieszka.setCar(new Car("C30", "Volvo"));
//        Car car1 = new Car ("C30","Volvo")  ;
//        System.out.println(car1.model);
//        System.out.println(car1.producer);


//	    Car car = new Car();
//        car.millage = 4.0;
//        car.engineVolume = 100.0;
//        car.color = "brown";
//        System.out.println(car.millage);
//        System.out.println(car.model);
//        System.out.println(car.producer);
//        System.out.println(car.color);

/*
        dog.species = "canis";
        dog.isAlive = true;
        dog.name = "Szarik";
        dog.weight = 5.0;
*/
        /*
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
         */
/*
        System.out.println(dog.weight);

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        System.out.println(dog.weight);

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        dog.feed();
        dog.feed();

        System.out.println(dog.weight);

        Human kacper = new Human();
        kacper.pet = dog;
        kacper.mobile = new Phone();
        kacper.mobile.model = "6s";
        System.out.println(kacper.pet.name);
        System.out.println(kacper.mobile.model);
*/
/*
        System.out.println(dog.species);
        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal();
        cat.species = "felis";
        cat.isAlive = true;
        cat.name = "sierściuch";

        System.out.println("ten kot to " + cat.name);
        System.out.println(cat.weight); //null

        Phone telefon1 = new Phone();
        telefon1.producer = "Samsung";
        telefon1.model = "S-10";
        telefon1.screenSize = 11.2;
        telefon1.os = "Android";

        Phone telefon2 = new Phone();
        telefon2.producer = "Xiaomi";
        telefon2.model = "X10";
        telefon2.screenSize = 10.5;
        telefon2.os = "Android";

        System.out.println("Telefon 1:");
        System.out.println("- producent: " + telefon1.producer);
        System.out.println("- model: " + telefon1.model);
        System.out.println("- screen size: " + telefon1.screenSize);
        System.out.println("- os: " + telefon1.os);

        System.out.println("Telefon 2:");
        System.out.println("- producent: " + telefon2.producer);
        System.out.println("- model: " + telefon2.model);
        System.out.println("- screen size: " + telefon2.screenSize);
        System.out.println("- os: " + telefon2.os);
*/
    }
}
