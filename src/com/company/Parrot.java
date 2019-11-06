package com.company;

import java.util.Random;

public class Parrot extends Animal {
    private boolean flying;
    private int seeds;

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public int getSeeds() {
        return seeds;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }

    public Parrot() {
        setWeight(randomOutput(500,4000));
        setHeight(randomOutput(50,200));
        setAge(randomOutput(1,95));
        setSound("Yaya");
    }

    public Parrot(Animal animal){
        moreSeeds();
        this.flying=false;
        setAge(animal.getAge());
        setWeight(animal.getWeight());
        setHeight(animal.getHeight());
        setSound(animal.getSound());
        setEat(animal.getEat());
        setName(animal.getName());
        setDays(animal.getDays());
    }

    public void fly(){
        setFlying(true);
    }
    public void land() {
        setFlying(false);
    }

    public void moreSeeds() {
        Random random=new Random();
        this.seeds=random.nextInt(30);
    }


    @Override
    public String toString() {
        return "The name of the animal: " + getName() + ".\n" +
                "The sound of the animal: " + getSound() + ".\n" +
                "The weight of the animal: " + getWeight() + ".\n" +
                "The height of the animal: " + getHeight() + ".\n" +
                "The amount of food needs: " + getEat() + ".\n" +
                "The age of the animal: " + getAge() + ".\n" +
                "The seeds in the storage: " + seeds + ".\n" +
                "The number of days: " + getDays() + " passed.\n" +
                "The fly statement is: " + flying + ".\n" ;

    }
}
