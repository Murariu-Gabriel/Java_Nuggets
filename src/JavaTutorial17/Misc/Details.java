package JavaTutorial17.Misc;

public class Details {

    static double dOne = 20.00D;
    static double dTwo = 80.00D;

    static double sum  = (dOne + dTwo) * 100.00D;

    static double remainder = sum % 40.00D;

    static boolean isRemainderZero = (remainder == 0) ? true : false;


    public static void main(String[] args) {
        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }

        System.out.println(sum);
    }
}
