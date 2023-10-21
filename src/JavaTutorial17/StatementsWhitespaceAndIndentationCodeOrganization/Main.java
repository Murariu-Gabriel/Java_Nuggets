package JavaTutorial17.StatementsWhitespaceAndIndentationCodeOrganization;

public class Main {

    public static void main(String[] args){

        // usually anything that

        // from int to ; this entire line is a statement

        int myVariable = 50;


        // the ; here makes these statements, without a semicolon these would be expressions
        myVariable++;
        myVariable--;


        // this is totally valid but it s not readable so you would be better not doing it
        int someVariable = 50; someVariable--;System.out.println("not readable");


    }

}
