package chapter5.exercises;
// Exercise 5.12
// Calculates the product of odd integers from 1 - 15

public class OddIntProduct {
    public static void main(String[] args){
        int product = 1;

        for (int counter = 1; counter <= 15; counter += 2){
            product *= counter;
        }

        System.out.printf("The product of all odd integers from 1 to 15 is %d", product);
    }
}
