package com.aymen.zoo;

class Bat extends Mammal {

    public Bat() {
        energyLevel = 300;
    }

    public void fly() {
        System.out.println("Bat takes off to fly!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat is satisfied after eating humans!");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Town is on fire! Bat attacks town!");
        energyLevel -= 100;
    }
}
