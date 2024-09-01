package week4_extra_questions;

public class ProblemStatement3 {
    public static void main(String[] args) {

//  Question 3: Problem Statement:
//  Given two strings, " Java" and "Java ", write a Java program that trims both strings and then checks
//  if they are equal after trimming.
//  Print "Equal" if they are the same, otherwise print "Not Equal".
//
//  Expected Output: Equal

     String str1 = "  java";
     String str2 = "java  ";

        System.out.println("before trim str1: " + str1);
        System.out.println("before trim str2: " + str2);

        String trimStr1 = str1.trim();
        String trimStr2 = str1.trim();

        System.out.println("*** *** *** *** *** ***");

        System.out.println("after trim str1: " + str1.trim());
        System.out.println("after trim str2: " + str2.trim());


            if (trimStr1.equals(trimStr2)) {
                System.out.println("Equal");
            }else {
                System.out.println("Not Equal");
            }


    }
}
