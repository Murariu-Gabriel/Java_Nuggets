package JavaTutorial17.KeywordsAndExpresions;

public class Main {

    // you can't use keywords like int, public or void as variable names

    // Expression - results to a single value

    // Statement - stand-alone units of work

    // Code Block - one or more statements groped in some way to achieve a goal (methods)

    public static void main(String[] args){
        double kilometers = (100 * 1.609344); // this is an expression

        int highScore = 50;

        if(highScore > 25) {
            highScore = 1000 + highScore;
        }

        // how mny expressions are there in the code bellow


        // health = 100, assigning 100 to health is an expression
        int health = 100;

        // Here we have 3 expressions, one in each parenthesis and the AND operator as the whole
        //  Each parenthesis has a result and then they are compared with the AND
        if((health < 25) && (highScore > 1000)){

            // the assigning of highScore is an expression and the operation result is also an epression
            highScore = highScore - 1000;
        }


    }

}
