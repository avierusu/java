// Self review exercise 4.37a
// Takes number of terms and calculates value of e using given number of terms

import java.util.Scanner;

public class Calc_e {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int number = input.nextInt();
        // later used to calc factorial up to the input number
        while (number < 1){
            System.out.print("Sorry, that is an invalid number\nEnter the number of terms: ");
            number = input.nextInt();
        }

        int term = 0;
        double result = 0;
        
        while (term <= number){
            double denominator = 1;
            int counter = term;

            while (counter >= 1){
                denominator *= counter;
                counter--;
            }

            result += (1/denominator);
            term++;
        }
        

        System.out.printf("The value of e is %f", result);

        input.close();
    }
}
