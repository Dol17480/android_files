package com.example.user.tddintro;

/**
 * Created by user on 07/11/2016.
 */

public class Robot {
    private String name;
    private String colour;
    private double battery;

    public Robot(String name, String colour){
        this.name = name;
        this.colour = colour;
        this.battery = 100.0;
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public Double getBattery() {
        return this.battery;
    }

    public String makeDrink(String drink) {
        this.battery -= 10;
        return "I am making " + drink;
    }

    public String washDishes(){
        this.battery -= 30;
        return "I am washing the dishes";
    }

    public String doDusting(){
        this.battery -= 20;
        return "I am dusting";
    }

    public void recharge(){
        this.battery = 100.0;
    }
}
