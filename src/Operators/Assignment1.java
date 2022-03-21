package Operators;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        if(c == 1){
            int sum = 0;
            for (int i = 1; i<= n; i++){
                sum += i;
            }
            System.out.println("Sum: " + sum);
        }else if (c == 2){
            int productSum = 1;
            for (int i = 1; i<= n; i++){
                productSum *= i;
            }
            System.out.println("Product: " + productSum);
        }else {
            System.out.println(-1);
        }
    }
}
