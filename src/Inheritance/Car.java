package Inheritance;

public class Car extends Vehicle{
    // extended classes can also have their own unique attributes and methods
    int wheels = 4;
    int doors = 4;

    // If we want to use the variables initiated in the parent class we need
    // to make a constructor in each extended class that has inside a supper the
    // variable names declared inside the parent class
    Car(String name, double speed){
        super(name, speed);
    }
}
