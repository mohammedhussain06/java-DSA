public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount b1 = new BankAccount();
        b1.setPassword("Abcd");

        Fish shark = new Fish();
        shark.eat();
        shark.swim();
    }
}

class Pen {
    String Color;
    int tip;

    void setColor(String newColor) {
        Color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

//Getters: To get a particular value e.g.: getColor() 
//Setters: To set a particular value e.g.: setColor()
//this: A keyword which refers to the current object 
//Encapsulation: Wrapping up of data and methods under a single unit; used for data hidind 
//Constructor: special function that is invoked at the time of object creation. They have sane name as the class. They are only created once. They don't have a return type
//Constructor has three types: paramterized, non-parameterized, copy constructor
//Destructor: destroys the objects from the memory 
//Inheritance: Properties and methods are derived from one class (Parent class) to child class
//Types of inheritance: Single, multilevel, hierarchial, hybrid
//Polymorphism: Mulptiple forms but similiar tasks e.g.: method overloading, method overriding 
//method overloading: same name but different parameters and size 
//method overriding: parent and child classes both contain the same function with a different definition 
//packages: group of similiar type of code, classes, interfaces and sub-packages, there are inbuilt and user defined packages
//Abstractiion: Hiding unnecessary details and only showing the necessary part of the data to the user. It has abstract classes and interfaces
//Abstract classes: 1. Cannot create instance of that class, 2. Can have constructors, 3. Can have abstract/non-abstract methods 
//Interface: It is a blueprint of a class
//Static keyword: Used to share same variable or method of a given class
//super keyword: Accesses the property of the immediate parent class