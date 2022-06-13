package com.scaler.bird;

public class Pigeon extends Bird implements Flyable{
    @Override
    public void eat() {

        System.out.println("Pigeon eat method");

    }

    @Override
    public void makeSound() {

        System.out.println("Pigeon makeSound method");

    }

    @Override
    public void fly() {
        System.out.println("Inside Pigeon fly method");
    }
}
