package Operators;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        int ans = 0;
        while(n != 0){
            int lastDigit = n%10;
            ans = (int) (ans + lastDigit*(Math.pow(2, i)));
            n = n/10;
            i++;
        }
        System.out.println("Decimal Form: " + ans);
    }
}
