package Patterns;

import java.util.Scanner;

public class PatternAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        while(i <= n){
//            int p = i;
//            int j = 1;
//            while(j <= i){
//                System.out.print(p);
//                p--;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            char ch = (char) ('A' + i - 1);
//            while(j <= i){
//                System.out.print(ch);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        int i = 1;
        while(i <= n){
            int j = 1;
            char ch = (char) ('A' + n - i);
            while(j <= i){
                System.out.print(ch);
                j++;
                ch ++;
            }
            System.out.println();
            i++;
        }

    }
}
