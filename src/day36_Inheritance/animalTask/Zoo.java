package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setInfo("Max", "Husky", 'M', 2,"Small", "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();

        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "Brown");

        Tiger tiger = new Tiger();

        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

    }

}
