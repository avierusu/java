package ntu_edu_site;

public class TestPreciseness {
    public static void main(String[] args){
        // doubles are NOT precice
        System.out.println(2.2 + 4.4);              // 6.6000000000000005
        System.out.println(6.6 - 2.2 - 4.4);        // -8.881784197001252E-16 (NOT Zero!)
        // Compare 2 doubles
        System.out.println((6.6) == (2.2 + 4.4));   // false
        
        System.out.println();

        // int is precise
        int num = 123456789;
        System.out.println(num * 10);               // 1234567890 (exact w/in range)

        System.out.println();
        
        float fNum = 123456789.0f;                  // float keeps 6-7 sig digits
        System.out.println(fNum);                   // 1.23456792e8 (= 1234567"92";; close, but not exact)
        System.out.println(fNum * 10);              // 1.23456794e9 (= 1234567"940")
    }
}
