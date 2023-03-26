package chapter3.examples;
import java.util.Scanner;

public class Account1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creates a new Account, like Scanner above
        Account1 myAccount = new Account1();

        System.out.printf("Original name is: %s\n\n", myAccount.getName());

        System.out.println("Enter a new name:");
        String newName = input.nextLine();
        myAccount.setName(newName);
        System.out.println();

        System.out.printf("Current name is: \n%s\n",
            myAccount.getName());

        input.close();
    }
}
