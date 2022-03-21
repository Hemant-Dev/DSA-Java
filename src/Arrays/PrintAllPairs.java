package Arrays;

import java.util.Scanner;

public class PrintAllPairs {
    public static void takeInput(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public static void  printPairs(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        printPairs(arr);
    }
}
