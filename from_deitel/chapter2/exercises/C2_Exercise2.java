//Self-Review Exercise 2.5

package chapter2.exercises;
import java.util.Scanner;

//This program will calculate the product of any 3 integers

public class C2_Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter the first integer here: ");
        x = input.nextInt();
        System.out.print("Enter the second integer here: ");
        y = input.nextInt();
        System.out.print("Enter the third integer here: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("The product is %d%n", result);

        input.close();
    }
}
