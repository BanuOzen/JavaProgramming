package day47_Polymorphism;

import day43_Abstraction.car.employee.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Cube;
import day45_Abstraction_Interface.shape.Shape;
import day45_Abstraction_Interface.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        // Shape shape = (Shape) new Circle("Circle", 4);

        Shape shape2 = new Circle("Circle", 5);

        //Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");




        //Dog dog = (Dog)animal;// downcasting
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        ( (Dog)animal ).bark();  // best solution

        Shape shape1 = new Square("Square", 5);
        System.out.println(((Square) shape1).getSide());
        System.out.println("==================================");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        //cat.Meow();

        ( (Cat) animal2 ).Meow();
        //( (Dog) animal2 ).bark();

        System.out.println("=======================================");

       Employee employee = new Tester("Ali", 30, 'M', 42,"SDET",145000);

        ((Tester)employee).bugReport();

       // ((Tester)employee).unitTest();
       // ((Developer)employee).unitTest();

       // Driver driver = (Driver)employee; //line1
        Person person = (Person)employee; //line2
      //  Teacher teacher = (Teacher)employee; //line3
        System.out.println("=========================");

        Shape s1 = new Circle("Circle", 10);
        s1.area();
        s1.perimeter();

        //   ( (Cube)s1 ).volume();











    }
}
