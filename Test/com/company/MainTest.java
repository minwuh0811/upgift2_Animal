package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static com.company.Main.dogBest;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void dogBestbyAge() {
        Dog dog1=new Dog(3,50,15);
        Dog dog2=new Dog (4,60,25);
        Dog dog3=new Dog (5,20,35);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        Dog bestDog=dogBest(dogs);
        assertEquals(dog1.age,bestDog.age);
    }
    @Test
    void dogBestbyHeightWhenAgeSame() {
        Dog dog1=new Dog(4,60,90);
        Dog dog2=new Dog (3,50,60);
        Dog dog3=new Dog (3,20,80);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        Dog bestDog=dogBest(dogs);
        assertEquals(dog3.height,bestDog.height);
    }

    @Test
    void dogBestbyWeightWhenAgeSameAndHeight() {
        Dog dog1=new Dog(3,60,55);
        Dog dog2=new Dog (3,50,55);
        Dog dog3=new Dog (3,70,35);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        Dog bestDog=dogBest(dogs);
        assertEquals(dog1.weight,bestDog.weight);
    }



}