package Lecture_18_Two_Pointers;

import java.util.*;
public class NonDecreasingSort {
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int l = 0, r = n-1;
        int[] ans = new int[n];
        int k = 0;
        while(l<=r){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                ans[k++] = arr[l]*arr[l];
                l++;
            } else{
                ans[k++] = arr[r]*arr[r];
                r--;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int i = 0,j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

        int[] ans = sortSquares(arr);
        reverse(ans);

        System.out.println("Array after Sorting:");
        printArray(ans);

        sc.close();
    }
}
