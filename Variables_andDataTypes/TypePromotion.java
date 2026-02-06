public class TypePromotion {
    public static void main(String[] args) {
        char a ='a';
        char b = 'b';

        System.out.println((int)a);  // 97
        System.out.println((int)b);   // 98
        System.out.println(a);  // a
        System.out.println(b-a);    // 1

        //---------- lossy conversion from int to char-------------
        // char c = b-a;  // will show error :cannot convert a int value to char
        // char d = (char)b-a;     // still wrong
        char d = (char)(b - a);  // correct
        System.out.println(d);  // non-printable control character
        char e = (char)(a+1); // 97 + 1 → 98 → 'b'
        System.out.println(e); // 

        // ---------------lossy conversion from int to byte------------
        short w1 = 5;
        byte w2 = 15;
        char w3 = 'r';
        System.out.println((int)w3);
        // byte bt = w1+w2*w3; // error   
        // also byte range is -128 to 127
        byte bt2 = (byte) (w1*w2*w3); // 8550 % 256 = 102
        //keeps only the last 8 bits (modulo 256)

        byte bt3 = (byte) (w1+w2-w3);
        System.out.println(bt2);
        System.out.println(bt3);

        //===================================================================================
        //2nd type of type promotion

        int t1 = 29;
        float t2 = 45.9945f;
        long t3 = 5689076;
        // 

        float ans = t1+t2+t3;
        System.out.println(ans);
        
        double t4 = 56768.8729387892;
        double ans2= (t1+t2+t3+t4);
        System.out.println(ans2);
        System.out.println(t4);
        System.out.println(t2);

        // lossy coversion from double to int
        // int ans1 = t1+t2+t3+t4;


        //-----------------------------

        // WRONG
            // byte b3 = 5;
            // b3 = b3*2;

        //RIGHT
        byte b3 = 5;
        b3 = (byte)(b3*2);
        System.out.println(b3);
    }
}
