package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;


public class Main {
    public Scanner scanner;
    public Hub hub;
    static ArrayList<Dog> dogList=new ArrayList<>();
    static ArrayList<Parrot> parrotList = new ArrayList<>();
    static ArrayList<Elephant> elephantList = new ArrayList<>();
    JScrollPaneAnimal jScrollPaneAnimal;
    JTextArea jText;


    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        while (true) {
            String choice=JOptionPane.showInputDialog("What do you want to do? Add animal press 1 or See the system press 2 or print the best one in each category press 3 or Quit press 4");
            switch (choice){
                case "1":
                    String name=JOptionPane.showInputDialog("Enter the name of the animal: ");
                    Animal animal = getRandomAnimal(name);
                    animalList(animal);
                    break;
                case "2":
                    Hub hub=new Hub();
                    int days=Integer.parseInt(JOptionPane.showInputDialog("How many days?"));
                    if (dogList.size()>0) {
                        for (Dog i : dogList) {
                            for (int n = 0; n < days; n++) {
                                i.ageAdd();
                                i.daysAdd();
                                if (i.age > 15) {
                                    dogList.remove(i);
                                } else {
                                    Dog dog=eatFood(i);
                                    if (dog.days%5==0) {
                                        dog.chewToy=false;}
                                    else {
                                        dog.newChewToy();}
                                    System.out.println(dog);
                                }
                            }
                        }
                    }
                    if (elephantList.size()>0) {
                        for (Elephant i : elephantList) {
                            for (int n = 0; n < days; n++) {
                                i.ageAdd();
                                i.daysAdd();
                                if (i.age > 70) {
                                    elephantList.remove(i);
                                } else {
                                    Elephant elephant=eatFood(i);
                                    if (elephant.bathed==false){
                                        elephant.bath();
                                    } else {
                                        elephant.bathed=false;}
                                    System.out.println(elephant);
                                }
                            }

                        }
                    }
                    if (parrotList.size()>0) {
                        for (Parrot i : parrotList) {
                            int seedTotal=0;
                            for (int n = 0; n < days; n++) {
                                i.ageAdd();
                                i.daysAdd();
                                if (i.age > 95) {
                                    parrotList.remove(i);
                                } else {
                                    Parrot parrot=eatFood(i);
                                    if (parrot.days% 2 ==0 || parrot.days%3==0) {
                                        parrot.fly();
                                    } else { parrot.land();}
                                    System.out.println(parrot);
                                }
                            }

                        }
                    }
                    break;

                case "3":
                    Dog bestDog=dogBest(dogList);
                    System.out.println("The best one in Dog category is: " + bestDog.name + ".\n" );
                    Parrot bestParrot=parrotBest(parrotList);
                    System.out.println("The best one in Parrot category is: " + bestParrot.name +".\n");
                    Elephant bestElephant=elephantBest(elephantList);
                    System.out.println("The best one in Elephant category is: " + bestElephant.name + ".\n" );
                    break;
                case "4":
                    System.out.println("Exit!!");
                    return;

                default:
                    JOptionPane.showMessageDialog(null,"Wrong Input try again");
                    break;

            }





        }
    }

    //public String getLine(Scanner scanner){
     //  return scanner.next();
    //}

    static public Animal getRandomAnimal(String name){
        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Parrot());
        animals.add(new Elephant());
        //System.out.println(animals);
        Random random=new Random();
        int index=random.nextInt(3);
        //System.out.println(index);
        Animal animal=animals.get(index);
        animal.setName(name);
        return animal;
    }

    static public void animalList(Animal animal){
        String sound=animal.makeSound();
        if (sound.equals("WOWO")) {
            dogList.add(new Dog(animal));
        } else if (sound.equals("Ji")) {
            elephantList.add(new Elephant(animal));
        } else if (sound.equals("Yaya")) {
            parrotList.add(new Parrot(animal));
        }
    }

    static public Dog eatFood(Dog dog){
            int eat=dog.randomOutput(23,42);
            if (dog.dogFood<eat){
                dog.moreDogFood();
            }
            dog.setEat(eat);
            return dog;
    }

    static public Elephant eatFood(Elephant elephant){
        int eat=elephant.randomOutput(30,50);
        if (elephant.bananas<eat){
            elephant.moreBananas();
        }
        elephant.setEat(eat);
        return elephant;
    }

    static public Parrot eatFood(Parrot parrot){
        int eat=parrot.randomOutput(7,12);
        if (parrot.seeds<eat){
            parrot.moreSeeds();
        }
        parrot.setEat(eat);
        return parrot;
    }

    static public Dog dogBest(ArrayList<Dog> dogs) {
        Collections.sort(dogs, new AnimalByComparetor());
        return dogs.get(0);

    }

    static public Parrot parrotBest(ArrayList<Parrot> parrots) {
        Collections.sort(parrots, new AnimalByComparetor());
        return parrots.get(0);

    }



    static public Elephant elephantBest(ArrayList<Elephant> elephants) {
        Collections.sort(elephants, new AnimalByComparetor());
        return elephants.get(0);

    }
}
