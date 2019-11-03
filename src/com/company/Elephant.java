package com.company;

import java.util.Random;

public class Elephant extends Animal {
    int bananas ;
    boolean bathed ;
    int days;
    static int day;

    public Elephant() {
        this.weight= randomOutput(3000000,7000000);
        this.height=randomOutput(200,400);
        this.age=randomOutput(1,70);
        this.sound="Ji";
    }
    public Elephant(Animal animal){
        moreBananas();
        this.bathed=false;
        this.age=animal.age;
        this.weight=animal.weight;
        this.height=animal.height;
        this.sound=animal.sound;
        this.eat=animal.eat;
        this.name=animal.name;
        this.days=animal.days;
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
        return "The name of the animal: " + name + ".\n" +
                "The sound of the animal: " + sound + ".\n" +
                "The weight of the animal: " + weight + ".\n" +
                "The height of the animal: " + height + ".\n" +
                "The amount of food needs: " + eat + ".\n" +
                "The age of the animal: " + age + ".\n" +
                "The bananas in the storage: " + bananas + ".\n" +
                "The number of days: " + days + " passed.\n" +
                "The bath statement is: " + bathed + ".\n" ;
    }
}
