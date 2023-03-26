package chapter5.exercises;
// Exercise 5.11
// Finds the smallest of several integers
// First value read = # integers to check out of

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nextNum;
        int smallestInt = 0;

        System.out.print("Enter the number of integers to look through: ");
        int numCount = input.nextInt();

        for (int counter = 1; counter <= numCount; counter++){
            System.out.printf("Enter %s number: ",
                             ((counter == 1)? "a" : "the next"));
            nextNum = input.nextInt();
            
            if ((counter == 1) || (nextNum < smallestInt)){
                smallestInt = nextNum;
            }
        }

        System.out.printf("\nThe smallest integer you entered was %d", smallestInt);

        input.close();
    }
}
