package com.company;

import java.util.Comparator;

public class AnimalByComparetor implements Comparator<Animal> {
    @Override
    public int compare(Animal x, Animal y) {
        int firstCompare=compare(x.age,y.age);
        if (firstCompare!=0) {
            return firstCompare;
        } else {
            firstCompare = compare(x.height,y.height);
            if (firstCompare!=0) {
                return (-firstCompare);
            } else {
                firstCompare=compare(x.weight,y.weight);
                return (-firstCompare);
            }
        }
    }

    private static int compare(long a, long b) {
        if (a < b) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return 0;
        }
    }



}



