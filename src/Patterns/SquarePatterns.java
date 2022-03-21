package Patterns;

import java.util.Scanner;

public class SquarePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Pattern - 1
//        int i = 1;
//        while (i <= n){
//            int j = 1;
//            while(j <= n){
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//          Pattern - 2
//        int i = 1;
//        while (i <= n){
//            int j = 1;
//            while(j <= n){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        Pattern - 3
        int i = 1;
        while (i <= n){
            int j = 1;
            while(j <= n){
                System.out.print(n - j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
