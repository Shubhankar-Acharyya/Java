package Lecture_19_Prefix_Sum;

import java.util.Scanner;

public class SubArraysEqualSum {
    //PrefixSumTechnique
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0;i<arr.length;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){

        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for(int i = 0 ; i<arr.length; i++){
            prefSum += arr[i];

            int suffixSum = totalSum - prefSum;

            if(prefSum == suffixSum){
                return true;
            }
        }
        return false;
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

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        
        System.out.println("Equal Partition Possible: "+equalSumPartition(arr));
        sc.close();
    }
}