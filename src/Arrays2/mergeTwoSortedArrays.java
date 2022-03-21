package Arrays2;

import java.util.Scanner;

import static Arrays.ArraysAssignments.printArray;
import static Arrays2.binarySearch.takeArrInput;

public class mergeTwoSortedArrays {

    public static int[] merge2SortedArr(int[] arr1, int[] arr2)
    {
        int[] arr = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            takeArrInput(arr1);
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            takeArrInput(arr2);
            int[] ans = merge2SortedArr(arr1, arr2);
            printArray(ans);
            t--;
        }
    }
}
