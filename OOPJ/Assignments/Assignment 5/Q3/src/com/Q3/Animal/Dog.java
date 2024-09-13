package com.Q3.Animal;

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Call the parent class constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
