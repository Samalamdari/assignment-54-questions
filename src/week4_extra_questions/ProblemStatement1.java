package week4_extra_questions;

public class ProblemStatement1 {
    public static void main(String[] args) {

//        Question 1: Problem Statement:
//        Create a Java program that replaces the word "Java" with "JAVA" in the string "Java is more than just Java, it's a platform!".
//        Ensure that only the exact word "Java" is replaced and not parts of other words.
//
//        Expected Output: JAVA is more than just JAVA, it's a platform!

        String originalStr = "Java is more than just Java, it's a platform!";
        String toUpperCase = originalStr.replaceAll("\\bJava\\b", "JAVA");

//        The replaceAll method is used with a regular expression (\\bJava\\b) to replace the exact word "Java" with "JAVA".
//        The \\b is a word boundary anchor in regex, ensuring that only whole words are matched.

        System.out.println("original str: " + originalStr);
        System.out.println("modified str: " + toUpperCase);


    }
}
