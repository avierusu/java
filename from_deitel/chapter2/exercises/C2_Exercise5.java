//Self-Review Exercise 2.15

package chapter2.exercises;
import java.util.Scanner;

//Prints + * - / of 2 integers

public class C2_Exercise5 {
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
        System.out.println("Sum:  " + num1 + " + " +
            num2 + " = " + (num1 + num2));
        System.out.println("Product:  " + num1 + " x " +
            num2 + " = " + (num1 * num2));
        System.out.println("Difference:  " + num1 + " - " +
            num2 + " = " + (num1 - num2));
        System.out.println("Quotient:  " + num1 + " / " +
            num2 + " = " + (num1 / num2) + "\n");

        input.close();
    }
}
