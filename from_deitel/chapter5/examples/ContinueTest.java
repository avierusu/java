package chapter5.examples;
// Fig 5.14

public class ContinueTest {
    public static void main(String[] args){
        for (int count = 1; count <= 10; count++){
            if (count == 5){
                continue;
            }

            System.out.printf("%d ", count);
        }

        System.out.print("\nUsed continue to skip printing 5\n");
    }
}
