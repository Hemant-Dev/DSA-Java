package Arrays2;

import java.util.Scanner;

import static Arrays.ArraysAssignments.printArray;
import static Arrays2.ArraysAssignment2.swap;
import static Arrays2.binarySearch.takeArrInput;

public class bubbleSort {

    public static void bubSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length - i - 1; j++)
            {
                if(arr[j] >= arr[j+1])
                {
                    swap(arr, i , j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            takeArrInput(arr);
            bubSort(arr);
            printArray(arr);
            t--;
        }
    }
}
