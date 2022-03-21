package Arrays;

import java.util.Scanner;

public class InputsAndOutputs {
    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n];
        for (int i=0; i<n; i++)
        {
            result[i] = sc.nextInt();
        }
        return result;
    }

    public static void printArray(int[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
//        for (int i : arr)
//        {
//            System.out.print(i + " ");
//        }
        printArray(arr);
    }
}
