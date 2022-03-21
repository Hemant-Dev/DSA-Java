package Func;

import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
//        1.
//        short i;
//
//        for(i=1;i>0;i++)
//        {
//
//        }
//        System.out.print(i);

//        2.
//        int i = 0;
//        for (System.out.print("Hi"); i < 1; i++)
//            System.out.print("Ninjas");

//        3.
//        for(int i=1; i<=10; i++);
//        System.out.print(i);

//        4.
//        int a=5,b=4;
//        System.out.println(a*=b);//line 1
//        System.out.println(a=(a==b));//line 2
//        System.out.println(a==b);//line 3
//        5.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i = 1;
//        while(i <= n){
////            I(A)
//            for(int j = 1; j<= n-i+1; j++){
//                System.out.print(j);
//            }
////            I(B)
//            for(int j = 1; j<=i-1; j++){
//                System.out.print("*");
//            }
////            II(A)
//            for(int j = 1; j<=i-1; j++){
//                System.out.print("*");
//            }
////            II(B)
//            for(int j = n-i+1; j>=1; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//            i++;
//        }

//        6.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//
//        System.out.println("Ans : " + probability(n, x));
//        7.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("Ans: " + removeMin(n, minNumber(n)));
        System.out.println("Ans: " + maxNumber(n));

    }
//    6.Question Functions Code
    public static int probability(int n, int x){
        double redProbability = nCr(4, x);
        System.out.println(redProbability);
        double remProbability = nCr(4, n-x);
        System.out.println(remProbability);
        double totalProbability = nCr(8, n);
        System.out.println(totalProbability);
        int ans = (int) (((redProbability * remProbability) / totalProbability) * 100);
        System.out.println(ans);
        return ans;
    }
    public static int nCr(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        return factN / (factR*factNR);
    }
    public static int factorial(int n){
        int ans = 1;
        for(int i = 2; i<=n; i++){
            ans *= i;
        }
        return ans;
    }
//    7.Question Min Number Function
    public static int minNumber(int n){
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<= 4; i++){
            int lastDig = n%10;

            if(lastDig <= min){
                min = lastDig;
            }
            n /= 10;
        }
        System.out.println(min);
        return min;
    }

    public static int removeMin(int n, int min){
        String ans = "";
        for (int i=1; i<=4; i++){
            int lastDig = n%10;
            if(lastDig == min){
                n /= 10;
                continue;

            }else {
                ans = ans + Integer.toString(lastDig);
                n /= 10;
            }


        }
        String reverseAns = new StringBuffer(ans).reverse().toString();
        return Integer.parseInt(reverseAns);
    }

//    Alternate and efficient Solution for maxNumber problem
    public static int maxNumber(int n){
        int ans = 0;
        int i = 1;
        while(n / i > 0){
            int temp = (n/(i*10))*i + (n%i);
            ans = Math.max(ans, temp);
            i*=10;
        }
        return ans;
    }
}
