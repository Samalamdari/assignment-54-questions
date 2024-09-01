package week4_54question;

import java.util.Scanner;

public class ReadingAndPrintingUserAge {
    public static void main(String[] args) {

//        Question 48: Reading and Printing User's Age
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter their age and store it in an int variable named age.
//        Print a message that includes the user's age (e.g., "You are 25 years old.").

        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("You are " + age + " years old.");




    }
}
