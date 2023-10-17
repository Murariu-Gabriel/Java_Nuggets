package Calculator_Project;

import java.util.Scanner;

public class Calcualtor {
    private double number1;
    private double number2;
    private double result;


    public void add() {
        result = number1 + number2;
    }

    public void substract() {
        result = number1 - number2;
    }

    public void multiply() {
        result = number1 * number2;
    }

    public void divide() {
        if(number2 != 0){
            result = number1 / number2;
        } else {
            System.out.println("Cannot divide by 0");
        }
    }

    public void runCalculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /)");
        String operation = scanner.next();

        System.out.println("Enter the second number");
        number2 = scanner.nextDouble();

        switch (operation) {
            case "+": {
                add();
                break;
            }
            case "-": {
                substract();
                break;
            }
            case "*": {
                multiply();
                break;
            }
            case "/": {
                divide();
                break;
            }
            default:{
                System.out.println("Invalid Operation");
                break;
            }

        }

        System.out.println("Result: " + result);

        scanner.close();

    }

}
