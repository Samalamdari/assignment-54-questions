package week4_54question;

import java.util.Scanner;

public class ConvertingCelsiusToFahrenheit2 {
    public static void main(String[] args) {

//        Question 43: Converting Celsius to Fahrenheit
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter a temperature in Celsius and store it in a double variable named celsius.
//        Convert the temperature to Fahrenheit using the formula: Fahrenheit = (celsius * 9/5) + 32.
//        Print the temperature in Fahrenheit.


        Scanner input = new Scanner(System.in);
        double celsius;

        System.out.print("Enter a temperature in celsius : ");
        celsius = input.nextDouble();

        double fahrenheit = ( celsius * 9/5) + 32;
        System.out.println("temperature in Fahrenheit: " + fahrenheit);



    }
}
