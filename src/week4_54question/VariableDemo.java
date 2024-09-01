package week4_54question;

public class VariableDemo {

    static int classLevelVar = 10;
    String instanceVar = "Hello";


    public static void main(String[] args) {

     double localVar = 20.5;
     localVar = 30.5;


        System.out.println(localVar);
        System.out.println(classLevelVar);

        Object VariableDemo = new Object();
        System.out.println(VariableDemo);



    }








}
