package chapter2.exercises;

//Self-Reflection Exercise 2.26
//Determines which of 2 ints is a multiple of the other

import java.util.Scanner;

public class C2_Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num1, num2;

        System.out.print("\nThis program takes 2 integers "
            + "and\ndetermines which is a multiple of the "
            + "other\nEnter your first integer here: ");
        num1 = input.nextInt();
        System.out.print("Enter your second integer here: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.printf("\n%d and %d are the same "
                + "number\n", num1, num2);
        } else if (num1 % num2 == 0) {
            System.out.printf("\n%d is a multiple of %d\n",
                num1, num2);
        } else if (num2 % num1 == 0) {
            System.out.printf("\n%d is a multiple of %d\n",
                num2, num1);
        } else {
            System.out.printf("\n%d is not a multiple of %d,"
                + " and %d is not a multiple of %d\n", num1, 
                num2, num2, num1);
        }

        input.close();
    }
}
