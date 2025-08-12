package Lecture_19_Prefix_Sum;

import java.util.Scanner;

public class RangeSum {
    //PrefixSumTechnique
    static int[] SumOfRangePrefixSum(int[] arr){
        System.out.println(arr.length+" elements in the array");
        int n = arr.length-1;
        int[] pref = new int[n+1];
        

        pref[1] = arr[1];
        for(int i = 2;i<=n;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }
    //Brute Force Approach
    static int SumOfRange(int[] arr,int f,int l){
        int sum = 0;
        for(int i = f; i <= l ;i++){
            sum += arr[i];
        }
        return sum;
    }
    static void printArray(int[] arr) {
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements:");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println("Original Array:");
        // printArray(arr);
        int[] prefSum = SumOfRangePrefixSum(arr);

        System.out.println("Enter num of queiries:");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter the first index: ");
            int f = sc.nextInt();
            System.out.println("Enter the last index: ");
            int l = sc.nextInt();
            int ans = prefSum[l] - prefSum[f - 1];
            System.out.println("Sum Of Range:"+ans);
        }

        sc.close();
    }
}
