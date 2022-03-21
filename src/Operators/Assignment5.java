package Operators;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int squareRoot = 1;
        while ((squareRoot * squareRoot) <= n){
            squareRoot++;
        }
        System.out.println(squareRoot - 1);
    }
}
