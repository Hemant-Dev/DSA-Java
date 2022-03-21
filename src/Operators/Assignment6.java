package Operators;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1 || n == 0){
            System.out.println("Results: null");
        }else {
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Numbers recorded");
            boolean result = false;
            if(arr[1] > arr[0]){
//            Increasing Sequence
                int i = 2;
                while (i < arr.length){
                    if(arr[i] > arr[i-1]){
                        result = true;
                    }else {
                        result = false;
                        break;
                    }
                    i++;
                }
            }else if(arr[1] < arr[0]){
//            Decreasing Sequence
                int i = 2;
                while(i < arr.length){
                    if(arr[i] < arr[i-1]){
                        result = true;
                    }else   {
                        result = false;
                        break;
                    }
                    i++;
                }


            }else{
                result = false;
            }
            System.out.println("Result: " + result);
        }

    }
}
