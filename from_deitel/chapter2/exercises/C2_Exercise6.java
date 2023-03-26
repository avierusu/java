//Self-Review Exercise 2.16

package chapter2.exercises;
import java.util.Scanner;

//Compares 2 integers to find the larger

public class C2_Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.printf("%n%s%n%s", "This program will find the larger of two integers.", "Enter your first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter your second integer: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        }

        if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        }


        if (num1 == num2) {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}
