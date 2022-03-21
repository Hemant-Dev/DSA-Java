package Strings;

import java.util.Scanner;

public class palindromeCheck {

    public static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length()-1;
        while(i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Palindrome: " + isPalindrome(str));
    }
}
