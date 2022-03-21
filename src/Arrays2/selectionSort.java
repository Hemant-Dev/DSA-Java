package Arrays2;

import java.util.Scanner;

import static Arrays.ArraysAssignments.printArray;
import static Arrays2.ArraysAssignment2.swap;
import static Arrays2.binarySearch.takeArrInput;

public class selectionSort {



    public static void selSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }

            }
            swap(arr, i, min);

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
            selSort(arr);
            printArray(arr);
            t--;
        }
    }
}
