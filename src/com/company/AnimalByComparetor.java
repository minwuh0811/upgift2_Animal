package com.company;

import java.util.Comparator;

public class AnimalByComparetor implements Comparator<Animal> {
    @Override
    public int compare(Animal x, Animal y) {
        return x.age-y.age;
    }
}

