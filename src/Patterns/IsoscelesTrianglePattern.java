package Patterns;

import java.util.Scanner;

public class IsoscelesTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(" ");
                spaces++;
            }

            int numbers = 1;
            while(numbers <= i){
                System.out.print(numbers);
                numbers++;
            }
            int decNumbers = i - 1;
            while(decNumbers >= 1){
                System.out.print(decNumbers);
                decNumbers--;
            }
            System.out.println();
            i++;
        }
    }
}
