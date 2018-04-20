package com.company;

public class Ship extends Vehicle {
    int people;
    String port;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getPort() {
        return port;
    }

    public Ship(int people, String port) {
        this.people = people;
        this.port = port;
    }

    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("People:" + people + "\nPort:" + port);

    }
}


