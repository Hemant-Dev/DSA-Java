package Arrays;

import java.util.Scanner;

public class swapAlternate {

    public static void takeInput(int[] arr)
    {
//        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public static void swapAlternate(int[] arr)
    {
        int n = arr.length;
        int swaps = n/2;
        int i = 0;
        int j = i+1;
        while(swaps != 0){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i = j+1;
            j = i+1;
            swaps--;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            takeInput(arr);
            swapAlternate(arr);
            t--;
        }
    }

    static Scanner sc = new Scanner(System.in);
}
