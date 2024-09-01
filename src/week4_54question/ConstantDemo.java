package week4_54question;

import java.sql.SQLOutput;

public class ConstantDemo {

    public static void main(String[] args) {

       final int MAX_USERS = 1000; // Once a variable is declared as final, its value cannot be changed.
        //MAX_USERS = 450;
        System.out.println(MAX_USERS); // cannot assign a value to final variable MAX_USERS


    }
}
