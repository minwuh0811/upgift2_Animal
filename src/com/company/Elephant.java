package com.company;

import java.util.Random;

public class Elephant extends Animal {
    private int bananas ;
    private boolean bathed ;

    public int getBananas() {
        return bananas;
    }

    public void setBananas(int bananas) {
        this.bananas = bananas;
    }

    public boolean isBathed() {
        return bathed;
    }

    public void setBathed(boolean bathed) {
        this.bathed = bathed;
    }

    public Elephant() {
        setWeight(randomOutput(3000000,7000000));
        setHeight(randomOutput(200,400));
        setAge(randomOutput(1,70));
        setSound("Ji");
    }
    public Elephant(Animal animal){
        moreBananas();
        this.bathed=false;
        setAge(animal.getAge());
        setWeight(animal.getWeight());
        setHeight(animal.getHeight());
        setSound(animal.getSound());
        setEat(animal.getEat());
        setName(animal.getName());
        setDays(animal.getDays());
    }


    public void bath(){
        this.bathed=true;
    }

    public void moreBananas() {
        Random random=new Random();
        this.bananas=this.bananas+random.nextInt(100);
    }
    @Override
    public String toString() {
        return "The name of the animal: " + getName() + ".\n" +
                "The sound of the animal: " + getSound() + ".\n" +
                "The weight of the animal: " + getWeight() + ".\n" +
                "The height of the animal: " + getHeight() + ".\n" +
                "The amount of food needs: " + getEat() + ".\n" +
                "The age of the animal: " + getAge() + ".\n" +
                "The bananas in the storage: " + bananas + ".\n" +
                "The number of days: " + getDays() + " passed.\n" +
                "The bath statement is: " + bathed + ".\n" ;
    }
}
