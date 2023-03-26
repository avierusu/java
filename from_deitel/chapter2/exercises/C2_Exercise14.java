package chapter2.exercises;

//Self-Review Exercise 2.30
//Takes a 5-digit # and separates each digit by 3 spaces

import java.util.Scanner;

public class C2_Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fiveDigitNumber, currentNum, dig1, dig2, dig3, dig4, dig5;

        System.out.print("\nThis program takes any 5-digit number"
            + " and\nseparates each digit by 3 spaces.\n"
            + "Enter any 5-digit number here: ");
        
        fiveDigitNumber = input.nextInt();
        currentNum = fiveDigitNumber;
        
        //Divides the 5-digit number by 10,000 to get the first digit
        dig1 = currentNum / 10000;
        //Gets the remainder of the above to "remove" the first digit for later
        currentNum = currentNum % 10000;
        dig2 = currentNum / 1000;
        currentNum = currentNum % 1000;
        dig3 = currentNum / 100;
        currentNum = currentNum % 100;
        dig4 = currentNum / 10;
        //Only the last digit remains once you get the remainder
        dig5 = currentNum % 10;

        if (dig1 < 10 && dig1 > 0) {
            System.out.printf("\n%d   %d   %d   %d   %d"
                , dig1, dig2, dig3, dig4, dig5);
        } else {
            System.out.printf("\n%d is not a 5-digit number.", fiveDigitNumber);
        }

        
        input.close();
    }
}
