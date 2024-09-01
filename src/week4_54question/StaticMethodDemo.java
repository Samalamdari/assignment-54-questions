package week4_54question;

public class StaticMethodDemo {

    static int counter = 0;

    static void incrementCounter() {

        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        incrementCounter();
        incrementCounter();
    }


}


