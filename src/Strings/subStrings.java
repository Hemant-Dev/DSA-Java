package Strings;

import java.util.Scanner;

public class subStrings {

    public static void subStringer(String str)
    {
        int n = str.length();
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(str.substring(i, j+1) + " ");
            }
            System.out.println();
        }
    }

    public static void approach2(String str)
    {
        int n = str.length();
        for(int len = 1; len <= n; len++)
        {
            for(int i = 0; i<=n - len; i++)
            {
                int j = i + len - 1;
                System.out.print(str.substring(i, j+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        subStringer(str);
        approach2(str);
    }
}
