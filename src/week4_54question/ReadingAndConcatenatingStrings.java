package week4_54question;

import java.util.Scanner;

public class ReadingAndConcatenatingStrings {
    public static void main(String[] args) {

//        Question 54: Reading and Concatenating Strings
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter their first name and store it in a String variable named firstName.
//        Ask the user to enter their last name and store it in a String variable named lastName.
//        Concatenate the first name and last name with a space in between.
//        Print the full name.

        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.print("Enter your first name: ");
        firstName = input.next();

        System.out.print("Enter your lastName: ");
        lastName = input.next();

        String fullName = (firstName + " " + lastName);
        System.out.println("Your full name is: " + fullName);





    }
}
