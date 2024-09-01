package week4_54question;

public class InstanceVariableDemo {

    int instanceCounter = 0;

    public static void main(String[] args) {

        InstanceVariableDemo input1 = new InstanceVariableDemo();
        input1.instanceCounter ++;
        System.out.println(input1.instanceCounter);
        InstanceVariableDemo input2 = new InstanceVariableDemo();
        input2.instanceCounter ++;
        System.out.println(input2.instanceCounter);

    }
}
