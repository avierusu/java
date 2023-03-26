package chapter3.exercises;

//Self-Review Exercise 3.12

import java.util.Scanner;

public class C3_E2InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exercise2Invoice myInvoice = new Exercise2Invoice("5A-191", "something", 27, 30);
        Exercise2Invoice notMyInvoice = new Exercise2Invoice("10-1-1-1-6", "wow", 9, 3);

        System.out.printf("For \"MyInvoice\",\n%s\nFor \"NotMyInvoice\",\n%s\n",
            myInvoice.toString(), notMyInvoice.toString());
        //a
        
        System.out.print("Give a new part number to \"MyInvoice\":\n");
        myInvoice.setPartNumber(input.nextLine());

        System.out.printf("For \"MyInvoice\",\n%s\nFor \"NotMyInvoice\",\n%s\n",
            myInvoice.toString(), notMyInvoice.toString());
        //a

        System.out.print("Give a new description to \"NotMyInvoice\":\n");
        notMyInvoice.setDesc(input.nextLine());

        System.out.printf("For \"MyInvoice\",\n%s\nFor \"NotMyInvoice\",\n%s\n",
            myInvoice.toString(), notMyInvoice.toString());
        //a

        System.out.print("Change the quantity of items of \"MyInvoice\": ");
        myInvoice.setQuantity(input.nextInt());

        System.out.printf("For \"MyInvoice\",\n%s\nFor \"NotMyInvoice\",\n%s\n",
            myInvoice.toString(), notMyInvoice.toString());
        //a

        System.out.print("Change the cost of each item of \"MyInvoice\": ");
        myInvoice.setPrice(input.nextDouble());

        System.out.printf("For \"MyInvoice\",\n%s\nFor \"NotMyInvoice\",\n%s\n",
            myInvoice.toString(), notMyInvoice.toString());
        //a

        System.out.printf("The invoice amount for \"MyInvoice\" is $%.2f", myInvoice.getInvoiceAmount());

        input.close();
    }
}
