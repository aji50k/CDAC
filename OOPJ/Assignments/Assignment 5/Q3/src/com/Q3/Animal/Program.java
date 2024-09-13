package com.Q3.Animal;

public class Program {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal");
        System.out.println("Animal:");
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Buddy");
        System.out.println("\nDog:");
        dog.eat();  
        dog.sleep();
        dog.bark(); 
    }
}
