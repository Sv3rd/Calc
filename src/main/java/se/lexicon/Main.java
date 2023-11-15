package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator Application");
        double result =0;
        char exit='y';
        while (exit == 'y'){

            Scanner scannerObject = new Scanner(System.in);
            System.out.println("Enter operation choice 1.Add 2. Subtract 3.Multiply 4.Divide");
            int operation = scannerObject.nextInt();
            System.out.println("Enter first number :");
            double number1 = scannerObject.nextDouble();

            System.out.println("Enter secund number :");
            double number2 = scannerObject.nextDouble();

            switch (operation){
                case 1:
                    result =  number1 + number2;
                    System.out.println(" Sum = " + result);
                    break;
                case 2:
                    result =  number1 - number2;
                    System.out.println(" Difference = " + result);
                    break;
                case 3:
                    result =  number1 * number2;
                    System.out.println(" Product = " + result);
                    break;
                case 4:
                    result =  number1 / number2;
                    System.out.println(" Division Result = " + result);
                    break;
                default:
                    System.out.println("Calculation is done");
        }

            System.out.println("Do you want to continue y/n?");
            exit = scannerObject.next().charAt(0);

        }
    }
    }