// Self review exercise 4.37a
// Takes non-negative integer and prints its factorial

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();
        while (number < 0){
            System.out.print("Sorry, that is an invalid number\nEnter a non-negative integer: ");
            number = input.nextInt();
        }

        int result = 1;
        int counter = number;

        while (counter >= 1){
            result *= counter;
            counter--;
        }

        System.out.printf("The factorial of %d is %d", number, result);

        input.close();
    }
}
