package Strings;

public class Basic {
    public static void main(String[] args) {
        char[] arr = {'C', 'o', 'd', 'i', 'n', 'g'};
        String str = "Coding";
        String str1 = " is fun";
        System.out.println(str1.length());
        System.out.println(str.charAt(0));
        str = str.concat(str1);
        System.out.println(str);
        String str2 = "abcd";
        String str3 = "abcda";
        System.out.println(str2.compareTo(str3));
        String a = "coding", b = "ninjas";
        if(a.contains("ing")){
            a+=b;
        }else {
            b+="ing";
        }
        System.out.println(b + a);
        String c = "coding";
        for(int i=2; i<5; i++){
            System.out.println(c.substring(i-2, i+1));
        }
    }
}
