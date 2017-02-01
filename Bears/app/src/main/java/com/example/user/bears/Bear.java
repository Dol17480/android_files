package com.example.user.bears;

import java.util.ArrayList;
/**
 * Created by user on 19/11/2016.
 */

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;
    private int age;
    private double weight;
    private double height;



    public Bear(String name, int age, double weight, double height) {
        this.name = name;
        this.belly = new ArrayList<Salmon>();
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public ArrayList<Salmon> getBelly() {
        return belly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate(){
        return this.weight >= 80.00;
    }

    public double getHeight() {
        return height;
    }

    public int foodCount(){
        return belly.size();
    }

    public void eat(Salmon salmon){
        belly.add(salmon);
    }

    public void sleep(){
        belly.clear();
    }
}
