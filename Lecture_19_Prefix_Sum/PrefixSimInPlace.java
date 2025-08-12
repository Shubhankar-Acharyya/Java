package Lecture_19_Prefix_Sum;

import java.util.Scanner;

public class PrefixSimInPlace {
    static int[] PrefixSumArrayInPlace(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n ;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
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
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);

        int[] pref = PrefixSumArrayInPlace(arr);
        System.out.println("Prefix Sum Array:");
        printArray(pref);

        sc.close();
    }
}
