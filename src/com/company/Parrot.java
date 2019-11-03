package com.company;

import java.util.Random;

public class Parrot extends Animal {
    boolean flying;
    int seeds;

    public Parrot() {
        this.weight= randomOutput(500,4000);
        this.height=randomOutput(50,200);
        this.age=randomOutput(1,95);
        this.sound="Yaya";
    }

    public Parrot(Animal animal){
        moreSeeds();
        this.flying=false;
        this.age=animal.age;
        this.weight=animal.weight;
        this.height=animal.height;
        this.sound=animal.sound;
        this.eat=animal.eat;
        this.name=animal.name;
        this.days=animal.days;
    }

    public void fly(){
        this.flying=true;
    }
    public void land() {
        this.flying=false;
    }

    public void moreSeeds() {
        Random random=new Random();
        this.seeds=random.nextInt(30);
    }


    @Override
    public String toString() {
        return "The name of the animal: " + name + ".\n" +
                "The sound of the animal: " + sound + ".\n" +
                "The weight of the animal: " + weight + ".\n" +
                "The height of the animal: " + height + ".\n" +
                "The amount of food needs: " + eat + ".\n" +
                "The age of the animal: " + age + ".\n" +
                "The seeds in the storage: " + seeds + ".\n" +
                "The number of days: " + days + " passed.\n" +
                "The fly statement is: " + flying + ".\n" ;

    }
}
