//package chapter4.exercises;

//Self-Review Exercise 4.3
//adds 1 to variable x in 4 diff ways

public class C4_Exercise1 {
    public static void main(String[] args) {
        int x = 1;

        System.out.printf("%d\n", x);
        x = x + 1;
        System.out.printf("%d\n", x);
        x += 1;
        System.out.printf("%d\n", x);
        x++;
        System.out.printf("%d\n", x);
        ++x;
        System.out.printf("%d\n", x);

    }
}
