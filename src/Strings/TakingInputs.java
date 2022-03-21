package Strings;

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        for(int i=0; i<3; i++)
        {
            str[i] = sc.next();
        }
        for(String s : str)
            System.out.println(s);
    }
}
