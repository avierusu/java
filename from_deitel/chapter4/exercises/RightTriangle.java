// Self review exercise 4.36
// Takes 3 non-zero integers and determines if they could represent sides of a right triangle

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take lengths for all 3 sides
        System.out.print("Enter first side length: ");
        int sideOne = input.nextInt();
        System.out.print("Enter second side length: ");
        int sideTwo = input.nextInt();
        System.out.print("Enter third side length: ");
        int sideThree = input.nextInt();

        // determine max and 2 min side lengths
        /*
         * Check a > b
         * if so, max = a, min1 = b. otherwise, max = b, min1 = a
         * check max > c
         * if so, max stays, min2 = c. otherwise, min2 = max, then max = c
         */
        int max, min1, min2;

        if (sideOne > sideTwo){
            max = sideOne;
            min1 = sideTwo;
        } else {
            max = sideTwo;
            min1 = sideOne;
        }

        if (max > sideThree){
            min2 = sideThree;
        } else {
            min2 = max;
            max = sideThree;
        }

        // Use Pythagorean theorem (a^2 + b^2 = c^2) to determine whether the sides make a right triangle
        if (Math.pow(min1, 2) + Math.pow(min2, 2) == Math.pow(max, 2)) {
            System.out.print("These side lengths make a valid right triangle");
        } else {
            System.out.print("These side lengths do not make a valid right triangle");
        }

        input.close();
    }
}
