package week4_54question;

public class LocalVariableDefaultValueDemo {

    public static void main(String[] args) {

        int uninitializedInt; // Local variables in Java do not have default values.
        // They must be explicitly initialized before they are used.
        // If you try to use an uninitialized local variable, the compiler will throw an error.
        // The error occurs because the local variable uninitializedInt was declared
        // but not initialized before being used.

        //System.out.println(uninitializedInt); // variable uninitializedInt might not have been initialized

        uninitializedInt = 0;
        System.out.println(uninitializedInt);
    }
}
