package Arrays2;

import java.util.Arrays;
import java.util.List;
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

    public static void rotateArray(int[] arr, int k)
    {
//        Temp Array approach
        int [] rotArr = new int[arr.length];
        int j =0;
        for(int i=k; i<arr.length; i++)
        {
            rotArr[j] = arr[i];
            j++;
        }
        for(int i=0; i<k; i++)
        {
            rotArr[j] = arr[i];
            j++;
        }
        System.arraycopy(rotArr, 0, arr, 0, arr.length);

    }

    static void rotateArray2(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        int i, j, l, temp;
        int g_c_d = gcd(k, n);
        for(i=0; i< g_c_d; i++)
        {
            temp = arr[i];
            j = i;
            while (true)
            {
                l = j + k;
                if(l >= n)
                    l = l-n;
                if(l == i)
                    break;
                arr[j] = arr[l];
                j = l;
            }
            arr[j] = temp;
        }
    }

    static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
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

//        int t = sc.nextInt();
//        while(t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int k = sc.nextInt();
//            rotateArray2(arr, k);
//            printArr(arr);
//            System.out.println();
//            t--;
//        }

//        3.Second Largest in the Array



    }
}
