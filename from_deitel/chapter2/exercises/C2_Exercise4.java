//Self-Review Exercise 2.14

package chapter2.exercises;

public class C2_Exercise4 {
    public static void main(String[] args) {
        //Displays #'s 1-4 on the same line in 3 ways with each # separated by 1 space

        //Way 1: 1 println statement
        System.out.println("1 2 3 4");

        //Way 2: 4 print statements
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("2 ");
        System.out.print("3\n");

        //Way 3: 1 printf statement
        System.out.printf("%s %s %s %s%n", "1", "2", "3", "4");
    }
}
