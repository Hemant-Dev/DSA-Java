package Strings;

import java.util.Scanner;

public class reverseWords {

    public static void revWords(StringBuffer str)
    {
        int i = 0;
        int j = 0;
        while(i < str.length())
        {
            if((str.charAt(i) == ' ') && (i < str.length() - 1)){
                rev(str, j, i-1);
                j = i+1;
            }
            i++;
        }
        rev(str, j, i-1);
    }

    public static void rev(StringBuffer str, int start, int end)
    {
//        for(int i=start; i<=end/2; i++)
//        {
//            char temp = str.charAt(i);
//            char temp1 = str.charAt(end - i);
//            str.setCharAt(end-i, temp);
//            str.setCharAt(i, temp1);
//        }
//        int count = 1;
        while (start < end)
        {
            char temp = str.charAt(start);
            char temp1 = str.charAt(end);
            str.setCharAt(end, temp);
            str.setCharAt(start, temp1);
            start++;
            end--;
//            count++;
        }

    }
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        str.append(sc.nextLine());
        revWords(str);
        System.out.println("Reverse String: " + str);
    }
}
