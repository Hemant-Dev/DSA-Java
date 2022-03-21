package Arrays2;

import java.util.Scanner;

import static Arrays.ArraysAssignments.printArray;
import static Arrays2.binarySearch.takeArrInput;

public class insertionSort {

    public static void insSort(int[] arr)
    {
        for (int i=1; i<arr.length; i++)
        {
            int key = arr[i+1];
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            takeArrInput(arr);
            insSort(arr);
            printArray(arr);
            t--;
        }
    }
}
