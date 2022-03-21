package Arrays;

import java.util.Scanner;

public class sumOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0)
        {
            int n = sc.nextInt();
            sumOfArray(n);
            t--;
        }
    }

    private static void sumOfArray(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Array is: " + SUM(arr));
    }

    private static int SUM(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
