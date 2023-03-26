package personal.quadratic_calculator;

import java.util.Scanner;

public class QuadraticCalc {
    public static void main(String[] args) {
        ComplexNumber root1, root2;
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Standard form of quadratic equation: Ax^2 + Bx + C\nEnter A: ");
        a = input.nextInt();
        System.out.print("Enter B: ");
        b = input.nextInt();
        System.out.print("Enter C: ");
        c = input.nextInt();

        if(b*b >= 4 * a * c) {
            root1 = new ComplexNumber((-b + Math.sqrt(b*b-4.0*a*c))/(2.0*a), 0);
            root2 = new ComplexNumber((-b - Math.sqrt(b*b-4.0*a*c))/(2.0*a), 0);
        } else {
            root1 = new ComplexNumber(-b*1.0/(2.0*a), Math.sqrt(Math.abs(b*b-4.0*a*c))/(2.0*a));
            root2 = new ComplexNumber(-b*1.0/(2.0*a), -Math.sqrt(Math.abs(b*b-4.0*a*c))/(2.0*a));
        }
        if (root1.toString() == root2.toString()) {
            System.out.printf("Root: %s", root1.toString());
        } else {
            System.out.printf("Root1: %s\nRoot2: %s", root1.toString(), root2.toString());
        }
        input.close();
    }
}
