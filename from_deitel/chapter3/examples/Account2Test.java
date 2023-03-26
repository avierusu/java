package chapter3.examples;
import java.util.Scanner;

public class Account2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creates 2 new Account2's
        Account2 myAccount1 = new Account2("Wow name woW");
        Account2 myAccount2 = new Account2("UaU");

        System.out.printf("myAccount1's name is: %s\n", myAccount1.getName());
        System.out.printf("myAccount2's name is: %s\n", myAccount2.getName());

        input.close();
    }
}
