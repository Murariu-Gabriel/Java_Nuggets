package WrapperClasses;

public class Main {
    // So wrapper classes are classes that contain data about the primitive data types that cannot be stored inside the primitives
    // every primitive data type has a wrapper class


    //an example of wrapperClass
    // this variables now stores the biggest number that an int can store
    static int integerMaxValue = Integer.MAX_VALUE;

    static byte bite = 10;
    static short str = 20;
    static int integer = 50;

    static long longNum = 50000L + 10L * (bite + str + integer);

    static int pounds = 200;

    static double results = pounds * 0.45359237;

    static int result = 10;

    public static void main(String[] args) {
        result -= 7;

        System.out.println(result);
        System.out.println(50 + "string");
        System.out.println();

    }
}
