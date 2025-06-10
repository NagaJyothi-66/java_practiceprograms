package jyothi;

import jyothi.Animal;
import jyothi.Cat;
import jyothi.Dog;

class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }

 void sleep() {
     System.out.println("This animal sleeps.");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Animal {
 void meow() {
     System.out.println("The cat meows.");
 }
}

//Main class to test the hierarchy
public class Inheritence {
 public static void main(String[] args) {
     // Create Dog object
     Dog dog = new Dog();
     System.out.println("Dog:");
     dog.eat();
     dog.sleep();
     dog.bark();

     System.out.println();

     // Create Cat object
     Cat cat = new Cat();
     System.out.println("Cat:");
     cat.eat();
     cat.sleep();
     cat.meow();
 }
}