package week4_54question;

import java.util.Scanner;

public class MultiplyingTwoNumbers {
    public static void main(String[] args) {

//        Question 45: Multiplying Two Numbers
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter two double values and store them in variables named num1 and num2.
//        Calculate the product of the two numbers.
//        Print the product.

        Scanner input = new Scanner(System.in);
        double num1;
        double num2;


        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        double product = (num1 * num2);
        System.out.println("The product of the two numbers is: " + product);





    }
}
