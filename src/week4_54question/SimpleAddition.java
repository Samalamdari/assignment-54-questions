package week4_54question;

import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {

//        Question 41: Simple Addition
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter two integers and store them in int variables named num1 and num2.
//        Calculate the sum of the two numbers.
//        Print the sum.

            Scanner input = new Scanner(System.in);
            int num1;
            int num2;

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        num2 = input.nextInt();

        System.out.println("Sum number1 + number2 = " + (num1 + num2));





    }
}
