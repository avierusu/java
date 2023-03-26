//package chapter4.exercises;

//Self-Review Exercise 4.19
/*Finds the earnings of a salesperson: 200$ per week, plus
9% of their sales for that week. They can sell 4 diff items,
each at diff prices*/

import java.util.Scanner;

public class C4_Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount, num = 1;
        double sales = 0, cost;
        boolean isValid = true;

        while (num <= 4) {
            System.out.printf("Enter %samount of item #%d sold: ",
                (isValid)?"":"valid ", num);
            amount = input.nextInt();
            if (amount < 0) {
                isValid = false;
            } else {
                switch(num) {
                    case 1:
                        cost = 239.99;
                        break;
                    case 2:
                        cost = 129.75;
                        break;
                    case 3:
                        cost = 99.95;
                        break;
                    case 4:
                        cost = 350.89;
                        break;
                    default:
                        cost = 0;
                }
                isValid = true;
                sales += cost * amount;
                num++;
            }
        }

        System.out.printf("This employee's earnings are: $%.2f", (sales * 0.09) + 200);

        input.close();
    }
}
