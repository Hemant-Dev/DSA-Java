package Func;

public class FibonacciMemeber {
    public static boolean isFibonacciMemeber(int n){
        int first = 0;
        int second = 1;
        int i = 0;
        while (i <= n){
            i = first + second;
            first = second;
            second = i;
            if(i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isFibonacciMemeber(14));
    }
}
