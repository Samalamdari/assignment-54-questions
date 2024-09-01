package week4_extra_questions;

public class ProblemStatement5 {
    public static void main(String[] args) {

// Question 5: Problem Statement:
// Write a Java program to find the index of the first occurrence of the character 'e' in the string "environment".
// Print the index to the console.
//
// Expected Output: 1

        String str = "environment";
        System.out.println("original str: " + str);
        System.out.println("length of str: " + str.length());
        System.out.println("index of str: " + (str.length() + - 1));


        System.out.println("***  ***  ***  ***");

        int index0 = str.indexOf('e');
        System.out.println("index:" + index0);

        int index1 = str.indexOf('n');
        System.out.println("index:" + index1);

        int index10 = str.indexOf('t');
        System.out.println("index:" + index10);






    }
}
