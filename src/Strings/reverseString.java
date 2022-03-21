package Strings;

import java.util.Scanner;

public class reverseString {

//    2nd form using 0 --> str.length

    public static String reversedString(String str)
    {
        String reversed = "";
        int n = str.length();
        for(int i=0; i<str.length(); i++)
        {
            reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }


//    Easy one from str.length --> 0

    public static String reverseString(String str)
    {
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reverse String: " + reverseString(str));
        System.out.println("Reverse String: " + reversedString(str));
    }
}
