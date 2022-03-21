package Patterns;

import java.util.Scanner;

public class MirrorImagePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Pattern -1
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while (spaces <= n - i){
                System.out.print(" ");
                spaces ++;
            }

            int stars = 1;
            while(stars <= i){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
