package chapter4.examples;

//takes pass status of 10 students on a test (1=pass, 2=fail)

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int fails = 0;
        int studentCounter = 1;
        int result;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1=pass, 2=fail): ");
            result = input.nextInt();

            if (result == 1) {
                passes++;
                studentCounter++;
            } else if (result == 2) {
                fails++;
                studentCounter++;
            } else {
                System.out.print("Enter a valid result\n");
            }
        }

        System.out.printf("Passed: %d\nFailed: %d\n", passes, fails);

        if (passes > 8) {
            System.out.printf("Bonus to the instructor (but no money).\n");
        }

        input.close();
    }
}
