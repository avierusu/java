package chapter3.exercises;

//Self Review Exercise 3.11

import java.util.Scanner;

public class C3_E1AccTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double depositAmount, withdrawalAmount;

        Exercise1Acc notMyAccount = new Exercise1Acc("Billy Bob", 50.00);
        Exercise1Acc rngAcc = new Exercise1Acc("RNG", -7.55);

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
        
        System.out.print("\nEnter an amount to withdraw from\n\"NotMyAccount\": ");
        withdrawalAmount = input.nextDouble();
        notMyAccount.withdraw(withdrawalAmount);

        System.out.printf("\n%s\n%s", notMyAccount.toString(), rngAcc.toString());

        input.close();
    }
}
