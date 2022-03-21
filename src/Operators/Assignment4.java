package Operators;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int power = 0;
        while(Math.pow(2, power) <= n){
            power++;
        }
        for(int i = power-1; i>=0; i--){
            int num = (int) Math.pow(2, i);
            int Q = n/num;
            int R = n%num;
//            System.out.println("Q : " + Q + " R : " + R);
            System.out.print(Q + " ");
            n = R;
        }
    }
}
