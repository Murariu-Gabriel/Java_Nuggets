package Encapsulation;

public class Car {
    // private makes these variables not accessible outside of this class
    private String make;
    private String model;
    private int year;

    // this is a constructor
    // here we use the setters so we can set the variables when we construct the object
    Car(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // Because we hve private variables we made setters and getters
    // so we can get and change the variables values
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String horn(String horn){
        return horn;
    }


}
