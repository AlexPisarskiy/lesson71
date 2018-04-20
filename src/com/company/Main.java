package com.company;

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane(123,234,2017, 40, 30,0, 2000, 5);
        plane.PrintInfo();
        Car car = new Car(123,234,2017, 40.0, 30.0, 0.0, 1234567800, 2208);
        car.PrintInfo();
        Ship ship = new Ship(789, "Odessa");
        ship.PrintInfo();
        }
    }
