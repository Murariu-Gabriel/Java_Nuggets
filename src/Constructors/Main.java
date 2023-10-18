package Constructors;

public class Main {
    public static void main(String[] args) {

        // By creating an instance of an object we can access the constructor method
        // inside the constructors method we have parameters to give each new object atributes
        Human human1 = new Human("Daniel", 20, 75.5);
        Human human2 = new Human("Dave", 22, 78);

        System.out.println(human1.name);
        human1.eat();
        human2.drink();
    }
}
