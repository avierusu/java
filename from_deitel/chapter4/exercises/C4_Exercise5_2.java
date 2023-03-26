//package chapter4.exercises;

//Self-Review Exercise 4.17, but better

import java.util.Scanner;

public class C4_Exercise5_2 {
    static double totalMPG;
    static int miles = 0, gallons = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int inputCounter = 0;

        while (getMiles() && getGallons()) {
            totalMPG += ((double) miles/gallons);
            System.out.printf("\nTrip %d used: %.2f miles per gallon\n\n", ++inputCounter, (double) miles/gallons);
        }

        if (inputCounter == 0) {
            System.out.print("\n\nInsufficient data provided.\n");
        } else {
            System.out.printf("\n\nOverall average of miles per gallon: %.2f\n", totalMPG / inputCounter);
        }
    }

    //test if miles is a valid number or sentinel number
    public static boolean getMiles() {
        boolean isValid = true;

        while (true) {
            System.out.printf("Enter %snumber of miles: ", (isValid)?"":"valid ");
            miles = input.nextInt();
            if (miles < -1) {
                isValid = false;
            } else {
                return (miles == -1)?false:true;
            }
        }
    }

    //test if gallons is a valid number or sentinel number
    public static boolean getGallons() {
        boolean isValid = true;

        while (true) {
            System.out.printf("Enter %snumber of gallons: ", (isValid)?"":"vaid ");
            gallons = input.nextInt();
            if (gallons < -1) {
                isValid = false;
            } else {
                return (gallons == -1)?false:true;
            }
        }
    }
}
