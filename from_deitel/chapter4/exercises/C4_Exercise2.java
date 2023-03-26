//package chapter4.exercises;

//Self-Review Exercise 4.4

import java.util.Scanner;

public class C4_Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1;
        int y = 1;
        int z = 1;
        int count;
        int total = 50;
        int q = 60;
        int divisor = 6;

        //a
        z = x++ + y;
        y = z;

        System.out.print("Enter a number \"count\": ");
        count = input.nextInt();

        //b
        if (count > 10) {
            System.out.printf("Count is greater than 10");
        }

        //c
        total -= --x;

        //d
        q %= divisor;

        q = 60;

        q = q % divisor;

        q += total;

        input.close();
    }
}
