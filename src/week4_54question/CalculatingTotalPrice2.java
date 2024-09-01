package week4_54question;

import java.util.Scanner;

public class CalculatingTotalPrice2 {
    public static void main(String[] args) {

//        Question 53: Calculating Total Price
//
//        Create a Scanner object to read input from the user.
//        Ask the user to enter the quantity of items and the price per item.
//        Store these values in int and double variables named quantity and pricePerItem.
//        Calculate the total price by multiplying quantity with pricePerItem.
//        Print the total price.

        Scanner input = new Scanner(System.in);
        int quantity;
        double pricePerItem;

        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter the price: ");
        pricePerItem = input.nextDouble();

        double totalPrice = quantity * pricePerItem;
        System.out.println("total price is: " + totalPrice);




    }
}
