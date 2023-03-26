// Self review exercise 4.30
/*
    Check for palindromes:
    First:
        Divide user input by constant 10000
        if quotient is 1-9, the number is 5 digits
        otherwise, prompt user for another number that is 5 digits
        repeat
    Second:
        Test if it's a palindrome

        [https://www.geeksforgeeks.org/check-number-palindrome-not-without-using-extra-space/]
        1) We can compare the first digit and the last digit, then we repeat the process.
        2) For the first digit, we need the order of the number. Say, 12321. Dividing this by 10000 would get us the leading 1.
        The trailing 1 can be retrieved by taking the mod with 10.
        3) Now, to reduce this to 232.
        (12321 % 10000)/10 = (2321)/10 = 232
        4) And now, the 10000 would need to be reduced by a factor of 100.
*/

import java.util.Scanner;

public class palindrome {
    // declaring constant
    private static final double TEN_THOUSAND = 10000;
    // static allows the variable to be accessible without creating an instance of the class
    // final restricts the user from changing the value of the variable
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a 5-digit integer: ");
        int palindrome = input.nextInt();
        boolean isPalindrome = false;
        
        // checks whether the user input is between 10000 - 99999
        while ((palindrome / TEN_THOUSAND < 1) || (palindrome / TEN_THOUSAND >= 10)) {
            System.out.print("Sorry, that is an invalid number.\nPlease enter a 5-digit integer: ");
            palindrome = input.nextInt();
        }
        
        // retrieve first and last digits for comparison
        int firstDigit = palindrome / 10000;
        int lastDigit = palindrome % 10;

        // reduce palindrome to just the middle 3 digits
        palindrome = (palindrome % 10000) / 10;

        // retrieve second and fourth digits for comparison
        int secondDigit = palindrome / 100;
        int fourthDigit = palindrome % 10;

        // determine whether the user entered a palindrome
        if ((firstDigit == lastDigit) && (secondDigit == fourthDigit)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        
        // Display whether or not the user entered a palindrome
        if (isPalindrome) {
            System.out.print("This is a palindrome.");
        } else {
            System.out.print("This is not a palindrome.");
        }

        input.close();
    }
}