package com.company;

import java.util.Random;

public class Dog extends Animal {
    boolean chewToy;
    int dogFood;

    public Dog() {
        this.weight= randomOutput(1000,35000);
        this.height=randomOutput(30,100);
        this.age=randomOutput(1,15);
        moreDogFood();
    }

    public void newChewToy(){
        this.chewToy=true;
    }

    public void moreDogFood(){
        Random random=new Random();
        this.dogFood=random.nextInt(50);
    }


}
