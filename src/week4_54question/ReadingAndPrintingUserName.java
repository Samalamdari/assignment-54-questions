package week4_54question;

import java.util.Scanner;

public class ReadingAndPrintingUserName {
    public static void main(String[] args) {

//        Question 40: Reading and Printing User's Name
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter their first name and store it in a String variable named firstName.
//        Ask the user to enter their last name and store it in a String variable named lastName.
//        Print a greeting message that includes the user's full name (e.g., "Hello, John Doe!").

        Scanner object = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.print("Enter your first name: ");
        firstName = object.next();

        System.out.print("Enter your last name: ");
        lastName = object.next();

        System.out.println("Hello, "+ firstName + " " + lastName);












    }
}
