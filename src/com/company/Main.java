package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Hub hub= new Hub();
        Dog dog= new Dog();
        Parrot parrot= new Parrot();
        Elephant elephant= new Elephant();
        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(dog);
        animals.add(parrot);
        animals.add(elephant);
        Random random=new Random();
        animals.get(random.nextInt(3));




    }
}
