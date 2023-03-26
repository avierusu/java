package chapter4.examples;

//Finds the average of an unknown # of grades on a quiz

import java.util.Scanner;

public class ClassAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;
        
        System.out.print("\nEnter grade (enter \"-1\" to quit): ");
        int grade = input.nextInt();

        while (grade != -1) {
            while (grade < 0 || grade > 100) {
                System.out.print("Please input a valid grade: ");
                grade = input.nextInt();
            }

            total += grade;
            gradeCounter++;

            System.out.print("Enter grade: ");
            grade = input.nextInt();
            
        }

        if (gradeCounter == 0) {
            System.out.print("\nNo grades were entered\n\n");
        } else if (gradeCounter == 1) {
            System.out.printf("\nYou entered 1 grade (%d)\n\n", total);
        } else {
            System.out.printf("\nTotal of all %d grades is: %d\nClass average is: %.2f\n\n",
                gradeCounter, total, (double) total/gradeCounter);
        }

        input.close();
    }
}
