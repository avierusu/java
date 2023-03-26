package ntu_edu_site;

public class CharLiterals {
    public static void main(String[] args){
        // char can be treated as an integer between [0, 65535], and vice versa

        char letter = 'a';                      // Same as 97
        char anotherLetter = 98;                // Same as the letter 'b'

        System.out.println(letter);             // 'a' printed
        System.out.println(anotherLetter);      // 'b' printed instead of the number, because type is char
        anotherLetter += 2;                     // 100, or 'd'
        System.out.println(anotherLetter);      // 'd' printed
    }
}
