package Lecture_16_Arrays3;

import java.util.Arrays;
import java.util.Scanner;

public class CountSumPairs {
    public static void main(String[] args) {

        //Input Taking of Array:: 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements :");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array is :");
        System.out.println(Arrays.toString(arr));

        //Main Solution
        int totalCount = 0;

        
        System.out.println("Enter the sum to comapre : ");
        int a = sc.nextInt();


        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j] == a){
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    totalCount++;
                }
            }
        }
        // int result = (int)totalCount/2;
        System.out.println(totalCount);
        sc.close();
    }
}
