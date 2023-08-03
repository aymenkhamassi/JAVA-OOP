package com.aymen.car;

public class Car {
    private int gas;
    private boolean gameOver;

    public Car() {
        this.gas = 10;
        this.gameOver = false;
    }

    public void status() {
        System.out.println("Gas remaining: " + gas + "/10");
        if (gas == 0) {
            gameOver = true;
            System.out.println("Game over: The car is out of gas.");
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}
