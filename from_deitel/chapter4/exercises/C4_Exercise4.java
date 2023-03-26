//package chapter4.exercises;

//Self-Review Exercise 4.6

public class C4_Exercise4 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x < 11) {
            sum += x++;
        }

        System.out.printf("The sum is: %d\n", sum);
    }
}
