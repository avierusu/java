package chapter3.exercises.c3_exercise4;

//Self-Review Exercise 3.14

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Date rightNow = new Date(10, 20, 30);

        rightNow.displayDate();

        System.out.print("\nChange the day to: ");
        rightNow.setDay(input.nextInt());
        rightNow.displayDate();

        System.out.print("\nChange the month to: ");
        rightNow.setMonth(input.nextInt());
        rightNow.displayDate();

        System.out.print("\nChange the year to: ");
        rightNow.setYear(input.nextInt());
        rightNow.displayDate();

        input.close();
    }
}
