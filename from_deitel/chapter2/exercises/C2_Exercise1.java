//Self-Review Exercise 2.3

package chapter2.exercises;
import java.util.Scanner;

public class C2_Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c, thisIsAVariable, q76354, value;

        System.out.print("Enter any integer here: ");
        value = input.nextInt();

        System.out.println("This is a Java program");

        System.out.printf("%s%n%s%n", "This is a Java", "program");
        
        if (value != 7) {
            System.out.println("The variable number is not equal to 7");
        }
        

        thisIsAVariable = 3;
        q76354 = 4;
        c = thisIsAVariable + q76354;
        q76354 = c;

        
        input.close();
    }
}
