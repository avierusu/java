//Self-Review Exercise 2.8

package chapter2.exercises;
import java.util.Scanner;

public class C2_Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter an integer: ");
        b = input.nextInt();

        c = 3;

        a = b * c;

        c = a;

        //A program performs a sample payroll calculation

        input.close();
    }
}
