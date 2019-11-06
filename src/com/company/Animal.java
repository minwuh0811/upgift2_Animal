package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Animal {

    private String sound;
    private String name;
    private int weight; // Unit gram
    private int height; // Unit centimeter
    private int eat;
    private int age;
    private int days;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getEat() {
        return eat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEat(int eat) {
        this.eat=eat;
    }

    public String makeSound() {
        return sound;
    }

    public int randomOutput(int a, int b){
        int randomInt = ThreadLocalRandom.current().nextInt(a, b);
        return randomInt;
    }

    public void ageAdd() {
        this.age++;
    }

    public void daysAdd(){
        this.days++;
    }

    @Override
    public String toString() {
        return "The name of the animal: " + name + ".\n" +
                "The sound of the animal: " + sound + ".\n" +
                "The weight of the animal: " + weight + ".\n" +
                "The height of the animal: " + height + ".\n" +
                "The amount of food needs: " + eat + ".\n" +
                "The age of the animal: " + age + ".\n" ;
    }
}
