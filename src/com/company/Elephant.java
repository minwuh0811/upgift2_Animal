package com.company;

import java.util.Random;

public class Elephant extends Animal {
    int bananas ;
    boolean bathed ;

    public Elephant() {
        this.weight= randomOutput(3000000,7000000);
        this.height=randomOutput(200,400);
        this.age=randomOutput(1,70);
        moreBananas();
    }

    public void bath(){
        this.bathed=true;
    }

    public void moreBananas() {
        Random random=new Random();
        this.bananas=random.nextInt(100);
    }
}
