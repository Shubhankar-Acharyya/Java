package Lecture_17_Arrays4;

import java.util.Scanner;

public class Rotate {

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k > n
        int[] ans = new int[n];
        int j = 0;

        // Copy last k elements
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy first n-k elements
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapIntArray(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayInPlace(int[] arr,int i,int j){

        while(i<j){
            swapIntArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[] arr,int k){
        int n = arr.length;
        k =k%n;
        reverseArrayInPlace(arr, 0 ,n-k-1);
        reverseArrayInPlace(arr, n-k,n-1);
        reverseArrayInPlace(arr,0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        rotateInPlace(arr, k);
        //int[] ans = rotate(arr, k);

        System.out.println("Array after rotation:");
        //printArray(ans);

        printArray(arr);
        sc.close();
    }
}
