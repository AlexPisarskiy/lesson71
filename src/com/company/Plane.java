package com.company;

public class Plane extends Vehicle {
        public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    float height;
    int people;

    public Plane(int price, int speed, int year, double x, double y, double z, float height, int people) {
        super(price, speed, year, x, y, z);
        this.height = height;
        this.people = people;
    }
}
