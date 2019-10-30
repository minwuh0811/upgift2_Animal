package com.company;

import java.util.Random;

public class Parrot extends Animal {
    boolean flying;
    int seeds;

    public Parrot() {
        this.weight= randomOutput(500,4000);
        this.height=randomOutput(50,200);
        this.age=randomOutput(1,95);
        moreSeeds();
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
}
