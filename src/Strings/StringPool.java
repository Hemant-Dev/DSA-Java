package Strings;

public class StringPool {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str3 = "abc";

        System.out.println("Before: " + str+" "+ str1+ " " + str3);
        str3 += 'd';
        str = str3;
        System.out.println("After: " + str + " " + str1+ " " + str3);
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
        str = "abc";
        str2 = str + " ";
        System.out.println(str == str2);
    }
}
