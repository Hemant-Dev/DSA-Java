package Func;

public class MoreOnFunction {

    public static int sum(int a, int b, double c){
        int ans = (int) (a + b + c);
        return ans;
    }
    public static double sum2(int a, int b){
        float c = a + b;
        return c;
    }

    public static void printEvenNumbers(int start, int end){
        if(start % 2 != 0){
            start++;
        }
        for(int i=start; i<=end; i+=2){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        double num3  = 20.0;
        System.out.println(sum(num1, num2, num3));
        System.out.println(sum2(num1, num2));
        printEvenNumbers(10, 20);
    }
}
