package Strings;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
        System.out.println("Before: " + str);
        str.setCharAt(0, 'A');
        System.out.println("After: " + str);
        str.append("def");
        System.out.println("Append: " + str);
        StringBuilder str1 = new StringBuilder("");
        for(int i=0; i<5; i++)
        {
            str1.append((char)('a' + i));
        }
        System.out.println(str1);
    }
}
