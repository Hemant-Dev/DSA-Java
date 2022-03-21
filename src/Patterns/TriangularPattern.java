package Patterns;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Pattern - 1
//        int n = sc.nextInt();
//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while(j <= i){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        Pattern - 2
//        int n = sc.nextInt();
//        int i = 1;
//        int p = 1;
//        while(i <= n){
//            int j = 1;
//            while(j <= i){
//                System.out.print(p);
//                j++;
//                p++;
//            }
//            System.out.println();
//            i++;
//        }
//        Pattern - 3
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int p = i;
            while(j <= i){
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
