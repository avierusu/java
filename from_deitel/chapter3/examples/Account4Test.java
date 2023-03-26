package chapter3.examples;
import java.util.Scanner;

public class Account4Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double depositAmount;

        Account4 notMyAccount = new Account4("Billy Bob", 50.00);
        Account4 rngAcc = new Account4("RNG", -7.55);

        System.out.printf("\n%s\n%s", notMyAccount.toString(), rngAcc.toString());

        System.out.print("\nEnter a deposit amount for \"NotMyAccount\": ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to \"NotMyAccount\"'s balance\n",
            depositAmount);
        notMyAccount.deposit(depositAmount);
        
        System.out.printf("\n%s\n%s", notMyAccount.toString(), rngAcc.toString());

        System.out.print("\nEnter a deposit amount for \"RNG-Acc\": ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to \"RNG-Acc\"'s balance\n",
            depositAmount);
        rngAcc.deposit(depositAmount);
        
        System.out.printf("\n%s\n%s", notMyAccount.toString(), rngAcc.toString());
        
        input.close();
    }
}
