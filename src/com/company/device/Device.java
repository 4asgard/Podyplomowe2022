package com.company.device;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString()    {
        return "Producer: " + this.producer + " \nModel: " + this.model + " \nRok produkcji: " + this.yearOfProduction;
    }
}

