package JavaTutorial17.MethodBasics;

public class Main {

    public static void main(String[] args){


        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);


    }

    // Important note, Java doesn't support default parameters for methods like JS for example
    // In Java we can have multiple methods with the same name with the condition that they have different parameters
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);

            System.out.println("Your final score was " + finalScore);
        }
    }


}
