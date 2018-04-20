package com.company;

public class Vehicle {
    int price;
    int speed;
    int year;
    double x;
    double y;
    double z;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;

    }

    public Vehicle(int price, int speed, int year, double x, double y, double z) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vehicle() {
    }

    public void PrintInfo()
    {
        System.out.println("Price: " +price +"\nSpeed:" +speed + "\nYear:" + year+ "\nX:" + x + "\nY:" + y + "\nZ:" + z);
    }
}
