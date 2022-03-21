package Func;

import java.util.Scanner;

public class NCR {
    public static long factN(int n){
        long result = 1;
        for(int i=1; i<= n; i++){
            result = result * i;
        }
        return result;
    }

    public static long nCr(int n, int r){
        long N = factN(n);
        long R = factN(r);
        long NR = factN(n-r);
        return N / (R * NR);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Result of "+n + " C " + r + " : " + nCr(n, r));
        int a = 10, b = 5;
        System.out.println("Result of " + a + " C " + b + " : " + nCr(a, b));
    }


}
