package Func;

public class DivideNumbers {
    public static int divideNumbers(int num, int deno){
        if(deno == 0){
            return Integer.MIN_VALUE;
        }
        return num / deno;
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        System.out.println(divideNumbers(a, b));
    }
}
