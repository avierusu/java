package chapter2.exercises;

//Self-Review Exercise 2.24
//Determines whether an int is even/odd

import java.util.Scanner;

public class C2_Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("\nThis program determines whether "
            + "an integer\nis even or odd.\n"
            + "Enter your integer here: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.printf("\n%d is an even number\n", num);
        } else {
            System.out.printf("\n%d is an odd number\n", num);
        }
        
        input.close();
    }
}
