//package chapter4.exercises;

//Self-Review Exercise 4.29
//astersik square

import java.util.Scanner;

public class C4_Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 0, row = 1, column = 1;

        
        while (size < 1 || size > 20) {
            System.out.print("Enter the size of your square (1-20): ");
            size = input.nextInt();
        }

        while (row <= size) {
            while (column <= size) {
                if (row == 1 || row == size || column == 1 || column == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            row++;
            column = 1;
            System.out.println();
        }

        input.close();
    }
}
