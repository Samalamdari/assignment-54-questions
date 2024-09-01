package week4_54question;

import java.util.Scanner;

public class AddingThreeNumbers {
    public static void main(String[] args) {

//        Question 52: Adding Three Numbers
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter three int values and store them in variables named num1, num2, and num3.
//        Calculate the sum of the three numbers.
//        Print the sum.

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Enter number1: ");
        num1 = (int) input.nextInt();

        System.out.print("Enter number2: ");
        num2 = input.nextInt();

        System.out.print("Enter number3: ");
        num3 = input.nextInt();

        int sum = (num1 + num2 + num3);
        System.out.println("sum: " + sum);


    }
}
