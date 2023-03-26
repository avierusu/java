package ntu_edu_site;

public class OverflowTest {
    public static void main(String[] args){
        // Range of in is [-2147483648, 2147483647]
        int maxI = 2147483647;
        int minI = -2147483648;

        System.out.println(maxI + 1);       // -2147483648 (overflow)
        System.out.println(maxI + 2);       // -2147483647 (overflow)
        System.out.println(maxI + 3);       // -2147483646 (overflow)
        System.out.println(maxI * 2);       // -2          (overflow)
        System.out.println(maxI * maxI);    // 1           (overflow)

        System.out.println(minI - 1);       // 2147483647  (ovreflow)
        System.out.println(minI - 2);       // 2147483646  (overflow)
        System.out.println(minI * minI);    // 0           (overflow)
    }
}
