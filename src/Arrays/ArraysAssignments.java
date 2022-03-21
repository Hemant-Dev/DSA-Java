package Arrays;

import java.util.Scanner;

public class ArraysAssignments {

    public static void takeInput(int[] arr)
    {
        System.out.println("In Take Input");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findUnique(int[] arr)
    {
        int unique  = 0;
        for (int j : arr) {
            unique = unique ^ j;
//            System.out.println(unique);
        }

        return unique;
    }

    public static int findDuplicate(int[] arr)
    {
        int duplicate = -1;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                {
                    duplicate = arr[i];
                    break;
                }
            }
        }
        return duplicate;
    }

    public static void findIntersection(int[] arr1, int[] arr2)
    {
        System.out.println("In Intersection Function");

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
    }

    public static void pairSum(int[] arr, int pair)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            int pairDiff = pair - arr[i];

            int j = i + 1;
            while (j < arr.length)
            {
                if(arr[j] == pairDiff)
                {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    count++;
                }
                j++;
            }

        }
        System.out.println(count);
    }

    public static void tripletSum(int[] arr, int sum)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == sum)
                    {
                        System.out.println("Triplets: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }

    }

    public static int[]  sort01(int[] arr)
    {
        int[] ans = new int[arr.length];
        int countZero = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                countZero++;
            }
        }
        for(int i=0; i<countZero; i++)
        {
            ans[i] = 0;
        }
        for(int i=countZero; i<arr.length; i++)
        {
            ans[i] = 1;
        }
        return ans;

    }

    public static void main(String[] args) {
//        1.Find Unique
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t != 0){
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int ans = findUnique(arr);
//            System.out.println("Unique: " + ans);
//            t--;
//        }

//        2.Find Duplicate
//        int t = sc.nextInt();
//        while(t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int ans = findDuplicate(arr);
//            System.out.println("Duplicate: " + ans);
//            t--;
//        }

//        3.Array Intersection
//        int t = sc.nextInt();
//        while (t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arrN = new int[n];
//            takeInput(arrN);
//            int m = sc.nextInt();
//            int[] arrM = new int[m];
//            takeInput(arrM);
//            findIntersection(arrN, arrM);
//
//            t--;
//        }

//        4.Pair Sum

//        int t = sc.nextInt();
//        while(t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int pair = sc.nextInt();
//            pairSum(arr, pair);
//            System.out.println();
//            t--;
//        }

//        5.Triplet Sum
//        int t = sc.nextInt();
//        while(t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int sum = sc.nextInt();
//            tripletSum(arr, sum);
//            t--;
//        }

//        6.Sort 0 1

//        int t = sc.nextInt();
//        while(t != 0)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            takeInput(arr);
//            int[] result = sort01(arr);
//            System.out.println();
//            printArray(result);
//            t--;
//        }
    }
}
