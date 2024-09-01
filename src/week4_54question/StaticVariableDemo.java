package week4_54question;

public class StaticVariableDemo {

    static int counter;

    public static void main(String[] args) {

        counter ++;
        System.out.println(counter);

        StaticVariableDemo input = new StaticVariableDemo();
        counter ++;
        System.out.println(counter);
    }
}
