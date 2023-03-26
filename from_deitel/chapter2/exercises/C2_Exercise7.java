package chapter2.exercises;

//Self-Review Exercise 2.17
//Finds the sum, avg, product, smallest, and largest of 3 ints

import java.util.Scanner;

public class C2_Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, smallest, largest;

        System.out.print("\nThis program calculates the sum,"
            + "\naverage, product, smallest, and largest"
            + "\nof any 3 integers"
            + "\n\nEnter your first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter your second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter your third integer: ");
        num3 = input.nextInt();

        //Find the largest of the 3 ints
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        //Find the smallest of the 3 ints
        if (num1 < num2) {
            if (num1 < num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else if (num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        

        System.out.printf("\nSum:  %d + %d + %d = %d\n",
            num1, num2, num3, (num1 + num2 + num3));
        System.out.printf("Average:  %d\n",
            (num1 + num2 + num3) / 3);
        System.out.printf("Product:  %d x %d x %d = %d\n",
            num1, num2, num3, (num1 * num2 * num3));
        System.out.printf("Smallest:  %d\n", smallest);
        System.out.printf("Largest:  %d\n", largest);

        input.close();
    }
}
