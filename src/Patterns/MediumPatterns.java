package Patterns;

import java.util.Scanner;

public class MediumPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Pattern - 1
//        int i = 1;
//        while(i <= n){
//            int spaces = 1;
//            while(spaces <= (2*n - 2*i)){
//                System.out.print(" ");
//                spaces++;
//            }
//
//
//            int j = i;
//            int k = 1;
//            while(k <= i){
//                System.out.print(j);
//                j++;
//                k++;
//            }
//            int l = 1;
//            while(l <= i-1){
//                System.out.print(j-2);
//                l++;
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//        Pattern - 2
        int newN = n/2 + 1;
//        System.out.println(newN);
        int i = 1;
        while(i <= newN) {
            int spaces = 1;
            while (spaces <= newN - i) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars <= (2 * i - 1)) {
                System.out.print("*");
                stars++;
            }
            int stars2 = 1;
            while (stars2 < i - 2) {
                System.out.print("*");
                stars2++;
            }
            System.out.println();
            i++;
        }
//        int remN = n - newN;
////        System.out.println(remN);
//        int k = 1;
//        while(k <= remN){
//            int spaces2 = 1;
//            while(spaces2 <= k){
//                System.out.print(" ");
//                spaces2++;
//            }
//            int stars3 = 1;
//            while(stars3 <= k+1){
//                System.out.print("*");
//                stars3++;
//            }
//            int stars4 = 1;
//            while(stars4 <= k){
//                System.out.print("*");
//                stars4++;
//            }
//            System.out.println();
//            k++;
//        }

    }
}
