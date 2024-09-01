package week4_54question;

public class FinalVariableDemo {
    public static void main(String[] args) {

        final int MAX_VALUE = 100;
        System.out.println(MAX_VALUE);

        // MAX_VALUE = 180;
        // The final keyword in Java is used to declare constants.
        // Once a final variable is assigned a value, it cannot be changed.
        // error: cannot assign a value to final variable MAX_VALUE :
        // This happens because MAX_VALUE is declared as final,
        // meaning its value is constant and cannot be altered after initialization.
        System.out.println(MAX_VALUE);



    }
}
