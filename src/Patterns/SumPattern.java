package Patterns;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1=1");

        for(int i=1; i<=n-1; i++){
            int sum = 1;
            System.out.print("1");
            for(int j = 2; j<=i+1; j++) {
                System.out.print("+" + j);
                sum += j;
            }
            System.out.print("="+sum);
            System.out.println();
        }
    }
}
