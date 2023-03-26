package chapter2.exercises;

//Self-Review Exercise 2.31
//Takes 5 #s and prints the # of -'s, +'s, and 0's

import java.util.Scanner;

public class C2_Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5, negCount, posCount, zCount;

        posCount = 0;
        negCount = 0;
        zCount = 0;

        System.out.print("\nThis program takes 5 numbers and determines"
            + "\nhow many negative numbers, positive numbers, and zeroes"
            + "\nwere inputted.\nEnter your first number here: ");
        num1 = input.nextInt();
        System.out.print("Enter your second number here: ");
        num2 = input.nextInt();
        System.out.print("Enter your third number here: ");
        num3 = input.nextInt();
        System.out.print("Enter your fourth number here: ");
        num4 = input.nextInt();
        System.out.print("Enter your fifth number here: ");
        num5 = input.nextInt();

        //Determines whether num1 is +, -, or 0
        if (num1 > 0) {
            posCount = posCount + 1;
        }
        if (num1 < 0) {
            negCount = negCount + 1;
        }
        if (num1 == 0) {
            zCount = zCount + 1;
        }

        //Determines whether num2 is +, -, or 0
        if (num2 > 0) {
            posCount = posCount + 1;
        }
        if (num2 < 0) {
            negCount = negCount + 1;
        }
        if (num2 == 0) {
            zCount = zCount + 1;
        }

        //Determines whether num3 is +, -, or 0
        if (num3 > 0) {
            posCount = posCount + 1;
        }
        if (num3 < 0) {
            negCount = negCount + 1;
        }
        if (num3 == 0) {
            zCount = zCount + 1;
        }

        //Determines whether num4 is +, -, or 0
        if (num4 > 0) {
            posCount = posCount + 1;
        }
        if (num4 < 0) {
            negCount = negCount + 1;
        }
        if (num4 == 0) {
            zCount = zCount + 1;
        }

        //Determines whether num5 is +, -, or 0
        if (num5 > 0) {
            posCount = posCount + 1;
        }
        if (num5 < 0) {
            negCount = negCount + 1;
        }
        if (num5 == 0) {
            zCount = zCount + 1;
        }

        System.out.printf("\nYou inputted:\n\n%d %s\n%d %s\n%d ",
            posCount, "Positive Number(s),", negCount, "Negative Number(s), and",
            zCount);
        
        if (zCount == 1) {
            System.out.print("Zero\n");
        } else {
            System.out.print("Zeroes\n");
        }

        input.close();
    }
}
