package Inheritance;

public class Main {
    public static void main(String[] args) {

        // here we have two objects that extend Vehicle
        // these objects inherit the methods created inside vehicle

        Car car = new Car("car", 200);
        Bicycle bike = new Bicycle("bike", 20);


        car.go();
        System.out.println(car.doors);
        System.out.println(car.getName());
        bike.go();
        System.out.println(bike.pedals);


    }
}
