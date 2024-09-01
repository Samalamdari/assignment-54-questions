package week4_extra_questions;

public class ProblemStatement2 {
    public static void main(String[] args) {

//        Question 2: Problem Statement:
//        Write a Java program to trim leading and trailing spaces from the string " Hello, World! ".
//        Print the resulting string to the console.
//
//        Expected Output: Hello, World!


        String originalStr = "   Hello, World!  ";
        String toTrim = (originalStr.trim());

        System.out.println("original str: " + originalStr);
        System.out.println("modified: " + toTrim);



    }
}
