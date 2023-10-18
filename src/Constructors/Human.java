package Constructors;

public class Human {
    // here we have the attributes of the object
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){

        // with this keyword we acces the variables inside each object and sign them the given attributes
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // here we have some methods that each class will have available
    void eat (){
        System.out.println(this.name + " is eating.");
    }

    void drink (){
        System.out.println(this.name + " is drinking.");
    }


}
