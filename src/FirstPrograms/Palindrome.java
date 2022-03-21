package FirstPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        boolean flag = false;
        for(int i = 0; i<n/2; i++)
        {
            if(str.charAt(i) == str.charAt(n-i-1))
            {
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("It's a Palindrome!");
        else
            System.out.println("Not a Palindrome!");


    }
}
