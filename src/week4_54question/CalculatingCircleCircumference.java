package week4_54question;

import java.util.Scanner;

public class CalculatingCircleCircumference {
    public static void main(String[] args) {

//        Question 46: Calculating Circle Circumference
//
//        Create a Scanner object to read input from the user.
//        Ask the user to  and store it in a double variable named radius.
//        Calculate the circumference using the formula: Circumference = 2 * Math.PI * radius.
//        Print the circumference.

        Scanner input = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius of a circle: ");
        radius = input.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);
        circumference = input.nextDouble();


    }
}
