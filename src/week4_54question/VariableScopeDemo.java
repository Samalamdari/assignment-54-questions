package week4_54question;

public class VariableScopeDemo {

    String globalVar = "Global";


    public static void main(String[] args) {

        String localVar = "Local";
        printVariables();

        System.out.println(localVar);

    }

    private static void printVariables() {
         // System.out.println(localVar);
        // This variable is only accessible within the main method, because created inside the main method.
        // localVar is not in the scope of the printVariables method,
        // it's only available within the block in which it's declared.
    }
}
