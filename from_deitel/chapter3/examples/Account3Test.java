package chapter3.examples;
import java.util.Scanner;

public class Account3Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account3 notMyAccount = new Account3("Billy Bob", 50.00);
        Account3 rngAcc = new Account3("RNG", -7.55);

        System.out.printf("\n(NotMyAccount) %s's balance: $%.2f\n",
            notMyAccount.getName(), notMyAccount.getBalance());
        System.out.printf("(RNG-Acc) %s's balance: $%.2f\n",
            rngAcc.getName(), rngAcc.getBalance());
        //y

        System.out.print("Enter a deposit amount for \"NotMyAccount\": ");
        double depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to \"NotMyAccount\"'s balance\n",
            depositAmount);
        notMyAccount.deposit(depositAmount);
        
        System.out.printf("\n(NotMyAccount) %s's balance: $%.2f\n",
            notMyAccount.getName(), notMyAccount.getBalance());
        System.out.printf("(RNG-Acc) %s's balance: $%.2f\n",
            rngAcc.getName(), rngAcc.getBalance());
        //y

        System.out.print("Enter a deposit amount for \"RNG-Acc\": ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to \"RNG-Acc\"'s balance\n",
            depositAmount);
        rngAcc.deposit(depositAmount);
        
        System.out.printf("\n(NotMyAccount) %s's balance: $%.2f\n",
            notMyAccount.getName(), notMyAccount.getBalance());
        System.out.printf("(RNG-Acc) %s's balance: $%.2f\n",
            rngAcc.getName(), rngAcc.getBalance());
        //y
        
        input.close();
    }
}
