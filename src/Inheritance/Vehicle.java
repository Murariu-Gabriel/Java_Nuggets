package Inheritance;

public class Vehicle {
    String name = "Vehicle";
    double speed;

    Vehicle(String name, double speed){
        this.name = name;
        this.speed = speed;
    }
    void go(){
        System.out.println("The " + this.name + " is moving and has max speed of " + speed);
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }

}
