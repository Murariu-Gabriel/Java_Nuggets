package Encapsulation;

public class Main {

    // void means that it doesn't return anything
    // static means that it can be called without making an instance of the class you can access it directly from the class
    public static void main(String[] args) {

        // All the attributes of a class will be hidden or private
        // they can be accessed only through setters and getters
        // if there is no reason for your attributes to be public/protected you should make them private


        // Car is the class we created
        // To make a new instance of Car we neet to call it give it a name and insert data in the constructor
        Car car = new Car("Mazda", "Miata", 1999);

        // after a new car object has been created we can acces the methods inside it
        car.setMake("Mercedes");
        car.setYear(2001);
        System.out.println(car.getMake() + " " + car.getYear());

        String horn = car.horn("dingdong");

        System.out.println(horn);
    }
}
