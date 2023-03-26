//package chapter4.exercises;

//Self-Review Exercise 4.21
//finds the 2 largests of 10 #'s

import java.util.Scanner;

public class C4_Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1, number, firstLargest = 0, secondLargest = 0;

        while (counter <= 10) {
            System.out.printf("Enter %s integer: ", (counter == 1)?"an":"the next");
            number = input.nextInt();

            if (number > secondLargest) {
                if (number >= firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = number;
                } else {
                    secondLargest = number;
                }
            }

            counter++;
        }

        System.out.printf("The largest number is %d\n", firstLargest);
        System.out.printf("The second largest number is %d\n", secondLargest);

        input.close();
    }
}
