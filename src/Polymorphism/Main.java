package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphism = greek word for poly -"many", morph -"form"
        // long story short polymorphism is the ability of an object to identify as more than one type

        // here we have 3 objects but all of them are extended off super class vehicle


        Car car = new Car("car");
        Bicycle bicycle = new Bicycle("bicycle");
        Boat boat = new Boat("boat");

        // to do

        // try to run the loop with racers as Object data type

        Vehicle[] racers = {car, bicycle, boat};


        // you need to understand this loop better and also polymorphism because it is not clear
        for(Vehicle x : racers){
            x.go();
        }


    }
}
