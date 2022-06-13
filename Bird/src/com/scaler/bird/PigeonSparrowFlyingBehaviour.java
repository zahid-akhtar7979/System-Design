package com.scaler.bird;

public class PigeonSparrowFlyingBehaviour implements PigeonSparrowFlyable{
    @Override
    public void fly() {
        System.out.println("Inside common fly method for Pigeeon and Sparrow");
    }
}
