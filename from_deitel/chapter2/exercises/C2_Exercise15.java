package chapter2.exercises;

//Self-Review Exercise 2.31
//Prints a table of squares and cubes from 0-10

public class C2_Exercise15 {
    public static void main(String[] args) {
        System.out.printf("\nnumber  square  cube");
        System.out.printf("\n%-8d%-8d%d", 0, (0*0), (0*0*0));
        System.out.printf("\n%-8d%-8d%d", 1, (1*1), (1*1*1));
        System.out.printf("\n%-8d%-8d%d", 2, (2*2), (2*2*2));
        System.out.printf("\n%-8d%-8d%d", 3, (3*3), (3*3*3));
        System.out.printf("\n%-8d%-8d%d", 4, (4*4), (4*4*4));
        System.out.printf("\n%-8d%-8d%d", 5, (5*5), (5*5*5));
        System.out.printf("\n%-8d%-8d%d", 6, (6*6), (6*6*6));
        System.out.printf("\n%-8d%-8d%d", 7, (7*7), (7*7*7));
        System.out.printf("\n%-8d%-8d%d", 8, (8*8), (8*8*8));
        System.out.printf("\n%-8d%-8d%d", 9, (9*9), (9*9*9));
        System.out.printf("\n%-8d%-8d%d", 10, (10*10), (10*10*10));
    }
}
