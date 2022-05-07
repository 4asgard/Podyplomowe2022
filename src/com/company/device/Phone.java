package com.company.device;

public class Phone extends Device {
    Double screenSize;
    String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
}
