package week4_54question;

public class ShadowingDemo {

    String name = "Class Level";

    public static void main(String[] args) {

        String name = "Local Level";
        System.out.println(name);


    }

}
