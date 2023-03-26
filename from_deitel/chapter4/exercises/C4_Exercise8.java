//package chapter4.exercises;

//10
//Self-Review Exercise 4.22

public class C4_Exercise8 {
    public static void main(String[] args) {
        int n = 1;

        System.out.printf("%-10s%-10s%-10s%-10s\n", "N", "10*N", "100*N", "1000*N");

        while (n <= 5) {
            System.out.printf("%-10d%-10d%-10d%-10d\n", n, 10*n, 100*n, 1000*n);
            n++;
        }
    }
}
