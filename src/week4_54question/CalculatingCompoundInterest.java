package week4_54question;

public class CalculatingCompoundInterest {
    public static void main(String[] args) {

// Question 35: Calculating Compound Interest
//
// Create a double variable named principalAmount and assign it the value 2000.0.
// Create a double variable named annualRate and assign it the value 4.5.
// Create an int variable named years and assign it the value 5.
// Calculate the compound interest using the formula: Amount = principalAmount * Math.pow((1 + annualRate/100), years).
// Print the amount.

        double principalAmount = 2000.0;
        double annualRate = 4.5;
        int years = 5;

        double interest = (principalAmount * Math.pow((1 + annualRate / 100), years));
        System.out.println("interest: " + interest);


    }
}
