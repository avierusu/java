// Self review exercise 4.33
// Multiples of 2 with an infinite loop

public class MultiplesOfTwo {
    public static void main(String[] args) {
        long multiple = 2;

        while (true) {
            System.out.print(multiple + ", ");
            multiple *= 2;
        }
    }
}