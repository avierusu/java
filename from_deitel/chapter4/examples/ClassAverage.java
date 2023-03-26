package chapter4.examples;

//Finds the average of 10 grades on a quiz

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;
        int grade;
        
        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.print("Please input a number between\n0 and 100 (including 0 and 100): ");
                grade = input.nextInt();
            }
            total += grade;
            gradeCounter++;
        }

        System.out.printf("\nTotal of all 10 grades is: %d\nClass average is: %.2f\n",
            total, total/10.0);
        //a

        input.close();
    }
}
