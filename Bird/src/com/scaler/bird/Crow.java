package com.scaler.bird;

public class Crow extends Bird implements Flyable{

    private PigeonSparrowFlyable pigeonSparrowFlyable;

    Crow(PigeonSparrowFlyable pigeonSparrowFlyable){
        this.pigeonSparrowFlyable = pigeonSparrowFlyable;
    }
    @Override
    public void eat() {

        System.out.println("Crow eat method");

    }

    @Override
    public void makeSound() {

        System.out.println("Crow makeSound method");

    }

    @Override
    public void fly() {
        pigeonSparrowFlyable.fly();
    }
}
