package Patterns;

import java.util.Scanner;

public class PatternsAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Pattern - Star Pattern
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n - i){
                System.out.print(" ");
                spaces++;
            }
            int stars1 = 1;
            while(stars1 <= i){
                System.out.print("*");
                stars1++;
            }
            int stars2 = 1;
            while(stars2 <= i-1){
                System.out.print("*");
                stars2++;
            }
            System.out.println();
            i++;
        }
    }
}
