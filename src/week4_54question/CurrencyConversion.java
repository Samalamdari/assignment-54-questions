package week4_54question;

public class CurrencyConversion {
    public static void main(String[] args) {

// Question 29: Currency Conversion
//
// Create a double variable named usdAmount and assign it the value 100.0.
// Create a double variable named conversionRate (e.g., USD to EUR) and assign it the value 0.85.
// Calculate the equivalent amount in EUR by multiplying usdAmount with conversionRate.
// Print the equivalent amount in EUR.


        double usdAmount = 100.0;
        double conversationRate = 0.85; //Conversion rate from USD to EUR
        double eurAmount = (usdAmount * conversationRate);
        System.out.println("the equivalent amount in EUR is: " + eurAmount  );

    }
}
