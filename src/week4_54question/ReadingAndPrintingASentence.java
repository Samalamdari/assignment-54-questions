package week4_54question;

import java.util.Scanner;

public class ReadingAndPrintingASentence {
    public static void main(String[] args) {

//        Question 44: Reading and Printing a Sentence
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter a sentence and store it in a String variable named sentence.
//        Print the sentence back to the user.

        Scanner input = new Scanner(System.in);
        String str = "sentence";

        System.out.print("Enter a sentence: ");
        str = input.nextLine();

        System.out.println(" You entered: " + str);


    }
}
