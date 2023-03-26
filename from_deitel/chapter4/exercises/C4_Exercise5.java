//package chapter4.exercises;

//Self-Review Exercise 4.17
/*takes miles-driven and gallons-used for multiple trips
and averages them*/

import java.util.Scanner;

public class C4_Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMPG = 0.0;
        int miles = 0, gallons = 0, inputCounter = 0, num = 1;

        System.out.printf("Enter miles driven for Trip %d (enter \"-1\" to quit): ", num);
        miles = input.nextInt();

        while (miles != -1 && gallons != -1) {
            if (inputCounter > 0) {
                System.out.printf("Enter miles driven for Trip %d (enter \"-1\" to quit): ", num);
                miles = input.nextInt();
            }

            //if miles is -1, exit the loop
            if (miles == -1) {
                break;
            }

            while (miles < 0 && miles != -1) {
                System.out.print("Enter a valid amount of miles (enter \"-1\" to quit): ");
                miles = input.nextInt();
            }
            if (miles == -1) {
                break;
            }            

            System.out.printf("Enter gallons used for Trip %d (enter \"-1\" to quit): ", num);
            gallons = input.nextInt();
            
            //if gallons is -1, exit the loop
            if (gallons != -1) {
                while (gallons < 0 && gallons != -1) {
                    System.out.print("Enter a valid amount of gallons (enter \"-1\" to quit): ");
                    gallons = input.nextInt();
                }
                if (gallons == -1) {
                    break;
                }

                inputCounter++;
                totalMPG += ((double) miles/gallons);
                System.out.printf("\nTrip %d used: %.2f miles per gallon\n\n", num, (double) miles/gallons);
                num++;
            }
        }

        if (inputCounter == 0) {
            System.out.print("\n\nInsufficient data provided.\n");
        } else {
            System.out.printf("\n\nOverall average of miles per gallon: %.2f\n", totalMPG / inputCounter);
        }

        input.close();
    }
}
