package week4_54question;

public class SimpleInterestCalculation {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 5.5;
        int time = 2;
        // Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
        double SimpleInterest = (principal * rate * time) / 100;
        System.out.println("SimpleInterest: $" + SimpleInterest);

    }
}
