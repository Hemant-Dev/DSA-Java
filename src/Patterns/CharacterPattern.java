package Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Pattern - 1
//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while(j <= n){
//                char jthChar = (char) ('A' + j - 1);
//                System.out.print(jthChar);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        Pattern - 2
        int i = 1;
        while(i <= n){
            char ch = (char)('A' + i - 1);
            int j = 1;
            while(j <= n){
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
