package Polymorphism;

public class Vehicle {
    String name;

    Vehicle(String name){
        this.name = name;
    }


    public void go(){
        System.out.println("The " + this.name + " is moving");
    }

}
