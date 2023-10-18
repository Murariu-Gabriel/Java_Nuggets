package Inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("car", 200);
        Bicycle bike = new Bicycle("bike", 20);
        car.go();
        System.out.println(car.dors);
        bike.go();
        System.out.println(bike.pedals);


    }
}
