package chapter5.exercises;
// Exercise 5.17
// Receives Product # and quantity sold, returns total price for all items
// Prod 1 = $2.98
// Prod 2 = $4.50
// Prod 3 = $9.98
// Prod 4 = $4.49
// Prod 5 = $6.87

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int prodNum = 1;
        int numSold = 1;
        double totalPrice = 0;

        while (prodNum != 0 && numSold != 0){
            System.out.print("\nEnter product number (0 to exit): ");
            prodNum = input.nextInt();
            if (prodNum != 0){
                System.out.print("Enter quantity sold (0 to exit): ");
                numSold = input.nextInt();
            }

            switch(prodNum){
                case 0:
                    break;
                case 1:
                    totalPrice += (2.98 * numSold);
                    break;
                case 2:
                    totalPrice += (4.50 * numSold);
                    break;
                case 3:
                    totalPrice += (9.98 * numSold);
                    break;
                case 4:
                    totalPrice += (4.49 * numSold);
                    break;
                case 5:
                    totalPrice += (6.87 * numSold);
                    break;
                default:
                    if (numSold != 0){
                        System.out.println("Invalid product number\n");
                    }
                    break;
            }
        }

        System.out.printf("\nTotal retail price of all products: $%.2f", totalPrice);

        input.close();
    }
}