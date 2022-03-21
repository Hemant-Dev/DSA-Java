package Operators;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//        Reverse Number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revNum = 0;
        while(n != 0){
            int lastDigit = n % 10;

            if(lastDigit == 0){
                revNum *= 10;
                n /= 10;
            }else{
                if(revNum == 0){
                    revNum = lastDigit;
                    n /= 10;
                }else{
                    revNum = (revNum * 10) + lastDigit;
                    n /= 10;
                }

            }

        }
        System.out.println("Reverse Number: " + revNum);
    }
}
