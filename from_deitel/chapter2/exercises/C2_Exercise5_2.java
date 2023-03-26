package chapter2.exercises;

//Self-Review Exercise 2.15, but printf instead of string concatenation

import java.util.Scanner;

public class C2_Exercise5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.printf("%n%s%n%s%n%s",
            "This program will find the sum, product,",
            "difference, and quotient of any two integers",
            "Enter your first integer here: ");
        num1 = input.nextInt();

        System.out.print("Enter your second integer here: ");
        num2 = input.nextInt();

        System.out.println("\nHere are your results:\n");
        System.out.printf("Sum:  %d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("Product:  %d x %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("Difference:  %d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("Quotient:  %d / %d = %d\n\n", num1, num2, (num1 / num2));

        input.close();
    }
}
