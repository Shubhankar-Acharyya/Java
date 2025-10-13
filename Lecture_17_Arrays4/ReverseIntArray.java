package Lecture_17_Arrays4;

import java.util.*;
public class ReverseIntArray {
    static int[] reverseArray(int[] arr){
        int n =arr.length;
        int[] ans = new int[n];
        int j = 0;
        System.out.println("Your Original Array is :"+Arrays.toString(arr));

        //Traverse in reverse
        for(int i = n-1;i>=0;i--){
            ans[j++] = arr[i];  //post increment so first execute then update
        }

        return ans;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapIntArray(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArrayInPlace(int[] arr){
        int i = 0, j = arr.length-1;

        while(i<j){
            swapIntArray(arr,i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //int[] ans = reverseArray(arr);
        //printArray(ans);
        
        reverseArrayInPlace(arr);
        printArray(arr);
        
    }
}
