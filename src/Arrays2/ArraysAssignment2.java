package Arrays2;

import java.util.Scanner;

public class ArraysAssignment2 {

    public static void takeInput(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
//            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void swap(int[] arr, int a, int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void pushZeroes(int[] arr)
    {
        int i = 0;
        int j = 1;
        while(i < j)
        {
            if(arr[i] != 0 && arr[j] == 0)
            {
                i++;
                j++;
            }else if(arr[i] == 0 && arr[j] == 0)
            {
                if(j < arr.length-1)
                {
                    j++;
                }else {
                    i++;
                }


            }else if(arr[i] == 0  && arr[j] != 0)
            {
                swap(arr, i, j);
                i++;
                j++;
            }

//            Not optimised for edge cases - NOTE
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.Push Zeroes to the end
//        int t = sc.nextInt();
//        while (t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            pushZeroes(arr);
//            printArr(arr);
//            t--;
//        }

//        2.Rotate Array



    }
}
