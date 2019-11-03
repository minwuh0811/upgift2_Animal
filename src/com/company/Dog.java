package com.company;

import java.util.Random;

public class Dog extends Animal {
    boolean chewToy;
    int dogFood;

    public Dog() {
        this.weight= randomOutput(1000,35000);
        this.height=randomOutput(30,100);
        this.age=randomOutput(1,15);
        this.sound="WOWO";
    }

    public Dog(Animal animal){
        moreDogFood();
        this.age=animal.age;
        this.weight=animal.weight;
        this.height=animal.height;
        this.sound=animal.sound;
        this.eat=animal.eat;
        this.name=animal.name;
        this.days=animal.days;
    }

    public void newChewToy(){
        this.chewToy=true;
    }

    public void moreDogFood(){
        Random random=new Random();
        this.dogFood=random.nextInt(50);
    }


}
