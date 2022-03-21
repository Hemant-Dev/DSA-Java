package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key)
    {
        int result = -1;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] == key){
                result = i;
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            int index = linearSearch(arr, key);
            System.out.println("Ans: " + index);
            t--;
        }
    }
}
