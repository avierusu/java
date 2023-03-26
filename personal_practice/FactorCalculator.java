package personal;

//Finds all divisors of any number

import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, posNum;
        int counter = 2;
        int factorCounter = 1;


        System.out.print("Enter any integer: ");
        num = input.nextInt();
        posNum = Math.abs(num);

        System.out.printf("The factors of %d are:\n1", num);

        while (counter <= posNum) {
            if (posNum % counter == 0) {
                factorCounter++;
                System.out.printf(", %d", counter);
            }
            counter++;
        }

        if (posNum == 1) {
            System.out.printf("\n%d has only 1 factor (itself)", num);
        } else {
            System.out.printf("\n%d has %d factors", num, factorCounter);
        }

        if (factorCounter == 2) {
            System.out.printf("\n%d is a prime number", num);
        }

        input.close();
    }
}
