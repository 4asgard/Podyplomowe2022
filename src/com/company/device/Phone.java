package com.company.device;

public class Phone extends Device implements Rechargeable{
    Double screenSize;
    String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void recharge()  {
        System.out.println("znajdź ładowarkę");
        System.out.println("podłacz");
        System.out.println("czekaj");
        System.out.println("czekaj");
        System.out.println("tak, ciągle czekaj");
    }
}
