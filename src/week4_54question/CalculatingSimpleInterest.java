package week4_54question;

import java.util.Scanner;

public class CalculatingSimpleInterest {
    public static void main(String[] args) {

//        Question 49: Calculating Simple Interest
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter the principal amount, rate of interest, and time in years.
//        Store these values in double variables named principal, rate, and time.
//        Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
//        Print the simple interest.

        Scanner input = new Scanner(System.in);
        double principalAmount;
        double rateOfInterest;
        double timeInYears;

        System.out.print("Enter the principal amount: ");
        principalAmount = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        rateOfInterest = input.nextDouble();

        System.out.print("Enter time in years: ");
        timeInYears = input.nextDouble();

        double interest = (principalAmount * rateOfInterest * timeInYears) /100;

        System.out.println("interest is: " + interest);



    }
}
