//package chapter4.exercises;

//Self-Review Exercise 4.21
//finds the largest of 10 #'s

import java.util.Scanner;

public class C4_Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1, number, largest = 0;

        while (counter <= 10) {
            System.out.printf("Enter %s integer: ", (counter == 1)?"an":"the next");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("The largest number is %d", largest);

        input.close();
    }
}
