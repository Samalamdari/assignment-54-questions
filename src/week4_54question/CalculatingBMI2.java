package week4_54question;

import week4forpractice.Week4Practice;

import java.util.Scanner;

public class CalculatingBMI2 {
    public static void main(String[] args) {

//        Question 51: Calculating BMI
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter their weight in kilograms and height in meters.
//        Store these values in double variables named weight and height.
//        Calculate the BMI using the formula: BMI = weight / (height * height).
//        Print the BMI.


        Scanner input = new Scanner(System.in);
        double weight;
        double height;

        System.out.print("Enter your weight in kilograms: ");
        weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        height = input.nextDouble();

        double BMI = weight / ( height * height);
        System.out.println("BMI is: " + BMI);


    }
}
