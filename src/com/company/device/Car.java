package com.company.device;

public class Car extends Device {
    Double millage;
    Double engineVolume;
    String color;
    Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
}
