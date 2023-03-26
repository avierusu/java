package chapter2.examples;
import java.util.Scanner;

public class Addition {
    public static void main(String[] arrrgs){
        //create a Scanner to get input from cmd window
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); //read 1st num

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);

        input.close();
    }
}
