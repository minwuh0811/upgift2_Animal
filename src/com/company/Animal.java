package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Animal {

    String sound;
    String name;
    int weight; // Unit gram
    int height; // Unit centimeter
    int eat;
    int age;
    public String makeSound() {
        return sound;
    }
    public void printValues(){
        System.out.println("The name of the animal: " + name + ".\n" +
                "The sound of the animal: " + sound + ".\n" +
                "The weight of the animal: " + weight + ".\n" +
                "The height of the animal: " + height + ".\n" +
                "The amount of food needs: " + eat + ".\n" +
                "The age of the animal: " + age + ".\n");
    }

    public int randomOutput(int a, int b){
        int randomInt = ThreadLocalRandom.current().nextInt(a, b);
        return randomInt;
    }
}
