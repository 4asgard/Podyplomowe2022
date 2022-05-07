package com.company.creatures;

import com.company.device.Car;
import com.company.device.Phone;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Pet pet;
    private Car car;
    private Double salary;

    public Car getCar() {
        return this.car;
    }

//    public void setCar(Car car) {
//        this.car = car;
//        if(this.salary > car.value)    {
//            System.out.println("Udało się kupić za gotówkę samochód: " + car.model);
//            this.car = car;
//        }   else if(this.salary > car.value / 12.0)   {
//            System.out.println("Kupiłeś na kredyt samochód " + car.model);
//        }   else    {
//            System.out.println("Najpierw uzbieraj!");
//        }
//    }

    public Double getSalary()   {
        System.out.println("Dane o wypłacie były pobrane: " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary)    {
        if(salary > 0)  {
            this.salary = salary;
            System.out.println("Twoja nowa wypłata wynosi: " + salary);
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz anekes do umowy od pani Hani z kadr");
            System.out.println("ZUS i US od teraz wiedzą o zmianie, nie ma sensu ukrywać dochodu");
        }
        else System.out.println("Nie można przypisać ujemnej wartości wynagrodzenia!");
    }


}
