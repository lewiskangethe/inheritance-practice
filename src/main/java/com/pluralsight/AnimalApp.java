package com.pluralsight;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();


        Dog dog = new Dog();
        dog.eat();
        dog.sniffButt();
        dog.sleep();
        dog.breathe();
    }
}
