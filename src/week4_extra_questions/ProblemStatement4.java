package week4_extra_questions;

public class ProblemStatement4 {
    public static void main(String[] args) {

//        Question 4: Problem Statement:
//        Create a Java program that trims the string " ERROR ",
//        converts it to lowercase, and then replaces 'error' with 'warning'.
//        Print the final string.
//
//        Expected Output: warning


        String str = " ERROR ";
        System.out.println("before trim str: " + str);

        String trim = str.trim();
        System.out.println("after trim:" + trim);

        String toLowerCase = trim.toLowerCase();
        System.out.println("after changed to lowercase:" + toLowerCase);

        String toReplace = toLowerCase.replaceAll("error","warning");
        System.out.println("final string is:" + toReplace);








    }
}
