package com.company;

public class Car extends Vehicle {
    public float getVincode() {
        return vincode;
    }

    public void setVincode(float vincode) {
        this.vincode = vincode;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    float vincode;
    float number;

    public Car(int price, int speed, int year, double x, double y, double z, float vincode, float number) {
        super(price, speed, year, x, y, z);
        this.vincode = vincode;
        this.number = number;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("vincode:" + vincode +"\nnumber:" + number);
    }
}
