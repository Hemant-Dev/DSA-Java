package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
//        int a = 10, b = 20;
//        int c = a&b;
//        System.out.println(c);
//        int d = a | b;
//        System.out.println(d);
//        int e = a ^ b;
//        System.out.println(e);
//        int f = c + d + e;
//        System.out.println(f);
//        System.out.println(~f);
        int a = 10, b = -20;
        System.out.println(a^b);
        System.out.println(-10 << 1);
        System.out.println(-10 >> 1);
        System.out.println(42 + " " + ~42);
        int c = 5;
        c += 5 + (++c) + (c++);
        System.out.println(c);


    }
}
