package com.company.device;

public class Car extends Device implements Rechargeable{
    Double millage;
    Double engineVolume;
    String color;
    Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void recharge()  {
        System.out.println("znajdź stację");
        System.out.println("podjedź");
        System.out.println("tankuj");
        System.out.println("tankuj");
        System.out.println("płać i płacz");
    }
}
