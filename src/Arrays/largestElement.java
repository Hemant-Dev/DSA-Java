package Arrays;

import java.util.Scanner;

public class largestElement {
    public static void largestElement(int[] arr ){
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if(i >= max)
            {
                max = i;
            }
        }
        System.out.println("Max Element is: " + max);
    }
    public static int[] takeInputArr(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeInputArr(n);
        largestElement(arr);

    }
}
