package Arrays2;

import java.util.Scanner;

public class binarySearch {

    public static int binSearch(int[] arr, int l, int r, int k)
    {
        while(l <= r)
        {
            int mid = (l + r) / 2;
            if(arr[mid] == k)
            {
                return mid;
            }
            if(arr[mid] < k)
            {
                return binSearch(arr, mid+1, r, k);
            }
            else {
                return binSearch(arr, l, mid - 1, k);
            }
        }
        return -1;
    }

    public static void takeArrInput(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeArrInput(arr);
        int t = sc.nextInt();
        while(t != 0)
        {
            int k = sc.nextInt();
            int ans = binSearch(arr, 0, arr.length-1, k);
            System.out.println("Index: " + ans);
            System.out.println("--------------------------");
            t--;
        }
    }
}
