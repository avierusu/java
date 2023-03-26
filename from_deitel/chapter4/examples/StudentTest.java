package chapter4.examples;

public class StudentTest {
    public static void main(String[] args) {
        Student guy1 = new Student("Billy Bob", 86);
        Student guy2 = new Student("NotBilly NotBob", 68);

        System.out.printf("\n%s\n%s\n", guy1.toString(), guy2.toString());
    }
}
