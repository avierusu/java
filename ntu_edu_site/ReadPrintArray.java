package ntu_edu_site;

import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = input.nextInt();
        items = new int[NUM_ITEMS];

        // Read items into the array (only if array length > 0)
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
               items[i] = input.nextInt();
            }
        }

        // Print array contents
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                // Print the first item without a leading comma
                System.out.print(items[0]);
            } else {
                // Print the rest of the items with leading commas
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");

        input.close();
    }
}
