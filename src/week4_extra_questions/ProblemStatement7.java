package week4_extra_questions;

public class ProblemStatement7 {
    public static void main(String[] args) {

//  Question 7: Problem Statement:
//  Create a Java program to determine the index of the substring "Java" in the string "Hello, world!".
//  If the substring is not found, print "-1".
//
//  Expected Output: -1

        String str = "Hello, World!";
        int index = str.indexOf("java");
        int index1 = str.indexOf("Wor");

        // The indexOf() method is used to find the
        // starting index of the substring "Java" within the string.
        // Since "Java" is not found in "Hello, world!", the method will return -1.

        System.out.println("length of str: " + str.length());
        System.out.println("index of str: " + (str.length() + - 1));

        System.out.println("The index of the substring 'Java' is: " + index);
        System.out.println("The index of the substring 'Wor' is: " + index1);




    }
}
