package week4_54question;

public class InitializationBlockDemo {

    static int staticVar;
     int instanceVar;

     static {
         staticVar = 50;
        }

        {
            instanceVar = 25;
        }

    public static void main(String[] args) {

        System.out.println(staticVar);

        InitializationBlockDemo input = new InitializationBlockDemo();

        System.out.println(input.instanceVar); // we should use object for print because this is not static.




    }

}
