package Arrays;

import java.util.Scanner;

public class arrangeArray {
    public static void arrangeArr(int[] arr)
    {
        int l = 0;
        int r = arr.length - 1;
        int num = 1;
        while(l < r) {
            arr[l] = num;
            arr[r] = num+1;
            num+=2;
            l++;
            r--;
        }
        arr[arr.length/2] = arr.length;
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            arrangeArr(arr);
            t--;
        }
    }
}
