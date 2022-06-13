package com.scaler.bird;

public class Sparrow extends Bird implements Flyable{

    private PigeonSparrowFlyable pigeonSparrowFlyable;

    Sparrow(PigeonSparrowFlyable pigeonSparrowFlyable){
        this.pigeonSparrowFlyable = pigeonSparrowFlyable;
    }

    @Override
    public void eat() {

        System.out.println("Sparrow eat method");

    }

    @Override
    public void makeSound() {

        System.out.println("Sparrow makeSound method");

    }

    @Override
    public void fly() {
        pigeonSparrowFlyable.fly();
    }
}
