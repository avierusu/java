package chapter2.exercises;

//Self-Review Exercise 2.28
/*Takes a radius for a circle and prints its diameter,
circumference, and area*/

import java.util.Scanner;
import java.lang.Math;

public class C2_Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;

        System.out.print("\nThis program takes the radius "
            + "(integer) of a circle\nand calculates the "
            + "circles diameter,\ncircumference, and area"
            + ".\nEnter a radius here: ");
        radius = input.nextInt();
        
        System.out.printf("\nDiameter:  %d", 2 * radius);
        System.out.printf("\nCircumference:  %f",
            2 * Math.PI * radius);
        System.out.printf("\nArea:  %f",
            Math.PI * (radius * radius));

        input.close();
    }
}
