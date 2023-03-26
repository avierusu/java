package chapter2.exercises;

//Self-Review Exercise 2.28
/*Takes a radius for a circle and prints its diameter,
circumference, and area, but printing "π" instead of multiplying by 3.14...*/

import java.util.Scanner;

public class C2_Exercise12_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;

        System.out.print("\nThis program takes the radius "
            + "(integer) of a circle\nand calculates the "
            + "circles diameter,\ncircumference, and area"
            + ".\nEnter a radius here: ");
        radius = input.nextInt();
        
        System.out.printf("\nDiameter:  %d", 2 * radius);
        System.out.printf("\nCircumference:  %d%s",
            2 * radius, "π");
        System.out.printf("\nArea:  %d%s",
            (radius * radius), "π");

        input.close();
    }
}
