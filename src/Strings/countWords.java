package Strings;

import java.util.Scanner;

public class countWords {
    public static int countWords(String str)
    {
        int count = 1;
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countWords(s);
        System.out.println("Total Words: " + ans);
    }
}
