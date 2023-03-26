// Self review exercise 4.35
// Takes 3 non-zero values and determines if they could represent sides of a triangle

import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take valid length for Side 1
        System.out.print("Enter first side length: ");
        int sideOne = input.nextInt();
        while (sideOne <= 0) {
            System.out.print("Sorry, that's an invalid number\nEnter first side length: ");
            sideOne = input.nextInt();
        }
        // Take valid length for Side 2
        System.out.print("Enter second side length: ");
        int sideTwo = input.nextInt();
        while (sideTwo <= 0) {
            System.out.print("Sorry, that's an invalid number\nEnter second side length: ");
            sideTwo = input.nextInt();
        }
        // Take valid length for Side 3
        System.out.print("Enter third side length: ");
        int sideThree = input.nextInt();
        while (sideThree <= 0) {
            System.out.print("Sorry, that's an invalid number\nEnter third side length: ");
            sideThree = input.nextInt();
        }

        // Rule: Sum of any 2 sides must be greater than the 3rd

        boolean isValidTriangle = false;

        if (sideOne + sideTwo > sideThree){
            if (sideOne + sideThree > sideTwo){
                if (sideTwo + sideThree > sideOne){
                    isValidTriangle = true;
                }
            }
        }

        if (isValidTriangle){
            System.out.print("These side lengths make a valid triangle");
        } else {
            System.out.print("These side lengths do not make a valid triangle");
        }

        input.close();
    }
}