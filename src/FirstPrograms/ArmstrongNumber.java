package FirstPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int og = num;
        int n = 0;
        while(temp > 0) {
            temp = temp / 10;
            n++;
        }
        for (int i=0; i<n; i++)
        {
            int last = num % 10;
            temp += Math.pow(last, n);
            num /= 10;
        }
        if(og == temp) {
            System.out.println(og +" = "+ temp+ " --> Armstrong Number");
        }else{
            System.out.println(og + " != " + temp+ " --> Not an Armstrong Number");
        }
    }
}
