package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class rearrangeWords {

    public static StringBuffer rearranger(StringBuffer str)
    {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        StringBuffer result = new StringBuffer();

        for(int i = temp.length-1; i>=0; i--)
        {
            result.append(temp[i]);
            result.append(" ");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        str.append(sc.nextLine());
        str = rearranger(str);
        System.out.println("Rearranged String: " + str);
    }
}
