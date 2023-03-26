package ntu_edu_site;

public class IntLiterals {
    public static void main(String[] args){
        // Can use prefix '0' to denote integer literal value in octal
        // or prefix '0x' or '0X' for a value in hexadecimal

        int number1 = 1234;         // Usual decimal
        int number2 = 01234;        // Octal 1234, Decimal 668
        int number3 = 0017;         // Octal 17, Decimal 15
        int number4 = 0x1abc;       // Hexadecimal 1ABC, decimal 6844

        System.out.printf("%d\n%d\n%d\n%d\n", number1, number2, number3, number4);
    }
}
