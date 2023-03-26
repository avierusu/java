package chapter4.examples;

public class Increment {
    public static void main(String[] args) {
        int c = 5;

        System.out.printf("%24s %d\n", "c before post-increment:", c);
        System.out.printf("%24s %d\n", "post-increment-ing c:", c++);
        System.out.printf("%24s %d\n\n", "c after post-increment:", c);

        c = 5;

        System.out.printf("%23s %d\n", "c before pre-increment:", c);
        System.out.printf("%23s %d\n", "pre-increment-ing c:", ++c);
        System.out.printf("%23s %d\n", "c after pre-increment:", c);
    }
}
