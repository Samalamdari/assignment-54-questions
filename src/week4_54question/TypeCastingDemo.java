package week4_54question;

public class TypeCastingDemo {
    public static void main(String[] args) {

        double doubleVar = 50.5;

        int intVar = (int) doubleVar;
        short shortVar = (short) doubleVar;

        System.out.println("doubleVar: " + doubleVar);
        System.out.println("intVar: " + intVar);
        System.out.println("shortVar: " + shortVar);
    }
}
