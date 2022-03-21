package Patterns;

import java.util.Scanner;

public class OddSquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(start);
                start += 2;
            }
            start = start - ((n - i) * 2);
            int odd = 1;
            for (int j = n - i + 1; j <= n - 1; j++) {
                System.out.print(odd);
                odd += 2;
            }

            System.out.println();
        }
    }
}
