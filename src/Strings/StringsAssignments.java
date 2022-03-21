package Strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringsAssignments {

    public static String sortingString(String inputString)
    {
        char[] temp = inputString.toCharArray();

        Arrays.sort(temp);

        return new String(temp);
    }

    public static String removeConDuplicates(StringBuffer str)
    {
//        char storedChar;
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length()-2; i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
                continue;
            else{
                result.append(str.charAt(i));
            }
        }
        result.append(str.charAt(str.length()-1));

        return result.toString();
    }


    public static String reverseWords(StringBuffer str)
    {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for(int i=0; i<temp.length; i++)
        {
            String s = "";
            for(int j = temp[i].length()-1; j>=0; j--)
            {
                s += temp[i].charAt(j);
            }
            result = result + s + " ";
        }


        return result;
    }

    public static void removeCharacter(StringBuffer str, char ch)
    {
        for (int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                str.deleteCharAt(i);
            }
        }
    }

    public static char highestOccuringCharacters(StringBuffer str)
    {
        char ans = 0;
        int previous = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 1;
            for(int j = i+1; j<str.length(); j++)
            {

                if (str.charAt(j) == ch)
                {
                    count++;
                }
            }

            if(previous < count)
            {
                ans = ch;
            }
            previous = Integer.max(previous, count);

        }
        return ans;
    }


    public static String compressString(StringBuffer str)
    {
        String result = "";
        int count = 0;
        char ch = 0;
        for(int i=0; i<str.length()-1; i++)
        {
            ch = str.charAt(i);
            if((str.charAt(i) != str.charAt(i+1)) || (i == str.length()))
            {
                count++;
                result = result + ch + count;
                count = 0;
            }else {
                count++;
            }


        }
        result = result + ch + (count+1);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      1.Permutation

//        String str1  = sc.nextLine();
//        String str2  = sc.nextLine();
//
//        if(str1.length() != str2.length())
//        {
//            System.out.println("Not Same");
//        }else {
//            str1 = sortingString(str1);
//            str2 = sortingString(str2);
////            System.out.println(str1);
////            System.out.println(str2);
//            if(str1.equals(str2))
//            {
////                System.out.println(str1.substring(0, str2.length()));
//                System.out.println("Same");
//            }else{
//                System.out.println("Not Same");
//            }
//        }
//


//        2.Remove Consecutive Duplicates

//        StringBuffer str = new StringBuffer();
//        str.append(sc.nextLine());
//        String answer = "";
//        answer = removeConDuplicates(str);
//        System.out.println("New String: " + answer);


//        3.Reverse Each Word in a String
//        StringBuffer str = new StringBuffer();
//        str.append(sc.nextLine());
//        String answer = reverseWords(str);
//        System.out.println("Answer: " + answer);


//        4.Remove Character

//        StringBuffer str = new StringBuffer();
//        str.append(sc.nextLine());
//        char ch = sc.next().charAt(0);
//        removeCharacter(str, ch);
//        System.out.println("String: " + str);

//        5.Highest Occurring Character

//        StringBuffer str = new StringBuffer();
//        str.append(sc.next());
//
//        char ans = highestOccuringCharacters(str);
//        System.out.println("char: " + ans);


//        6.Compressed String

        StringBuffer str = new StringBuffer();
        str.append(sc.next());
        String ans = compressString(str);
        System.out.println("Ans: " + ans);


    }
}
