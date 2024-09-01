package week4_extra_questions;

public class ProblemStatement6 {

    public static void main(String[] args) {

// Question 6: Problem Statement:
// Given the string "concatenation", write a Java program to find the index of the substring "cat" within it.
// Print the resulting index.
//
// Expected Output: 3

        String str = "concatenation";
        int index = str.indexOf("cat");
        //The indexOf() method is used to find
        // the starting index of the substring "cat" within the string.
        // The index is stored in the index variable.

        System.out.println("str: " + str);
        System.out.println("The index of the substring 'cat' is: " + index);





    }

}
