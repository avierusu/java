package chapter5.exercises;
// Exercise 5.13
// Calculates factorials of 1 - 20

public class Factorials {
    public static void main(String[] args){
        for (int num = 1; num <= 20; num++){
            System.out.printf("Factorial of %2d = %.0f\n", num, factorial(num));
        }
    }

    public static double factorial(int number){
        double result = 1;
        for (int maxVal = number; maxVal >= 1; maxVal--){
            result *= maxVal;
        }
        return result;
    }
}
