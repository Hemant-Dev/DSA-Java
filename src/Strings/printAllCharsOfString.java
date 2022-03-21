package Strings;

import java.util.Scanner;

public class printAllCharsOfString {
    public static void printString(String str)
    {
        for(int i=0; i<str.length(); i++)
            System.out.println(str.charAt(i));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printString(str);
    }
}
