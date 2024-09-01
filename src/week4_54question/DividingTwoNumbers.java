package week4_54question;

import java.util.Scanner;

public class DividingTwoNumbers {
    public static void main(String[] args) {

//        Question 47: Dividing Two Numbers
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter two double values and store them in variables named num1 and num2.
//        Calculate the result of dividing num1 by num2.
//        Print the result.

        Scanner input = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Enter number1: ");
        num1 = input.nextDouble();

        System.out.print("Enter number2: ");
        num2 = input.nextDouble();

        double dividing = (num1 / num2);
        double dividing2 = (num2 / num1);

        System.out.println("the result of dividing num1 by num2 is: " + dividing);
        System.out.println("the result of dividing num2 by num1 is: " + dividing2);


    }
}
