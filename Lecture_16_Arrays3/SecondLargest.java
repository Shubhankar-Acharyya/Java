package Lecture_16_Arrays3;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        //Input taking of array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the Elements: ");

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your string is :");
        System.out.println( Arrays.toString(arr));   //Converts array to printable string format.

        //Actual Solution
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
