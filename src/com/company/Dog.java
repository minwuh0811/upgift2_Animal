package com.company;

import java.util.Random;

public class Dog extends Animal {
    private boolean chewToy;
    private int dogFood;

    public boolean isChewToy() {
        return chewToy;
    }

    public void setChewToy(boolean chewToy) {
        this.chewToy = chewToy;
    }

    public int getDogFood() {
        return dogFood;
    }

    public void setDogFood(int dogFood) {
        this.dogFood = dogFood;
    }

    public Dog() {
        setWeight(randomOutput(1000,35000));
        setHeight(randomOutput(30,100));
        setAge(randomOutput(1,15));
        setSound("WOWO");
    }

    public Dog(Animal animal){
        moreDogFood();
        setAge(animal.getAge());
        setWeight(animal.getWeight());
        setHeight(animal.getHeight());
        setSound(animal.getSound());
        setEat(animal.getEat());
        setName(animal.getName());
        setDays(animal.getDays());
    }

    public Dog (int age, int weight, int height) {
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public void newChewToy(){
        this.chewToy=true;
    }

    public void moreDogFood(){
        Random random=new Random();
        this.dogFood=random.nextInt(50);
    }


}
