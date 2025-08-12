package Lecture_16_Arrays3;

import java.util.*;

public class FindUnique {
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

        int ans = -1;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                arr[i] = -1;
                arr[j] = -1;
                }
            }
        }

        for(int i = 0; i<n;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }

        System.out.println(ans);
    }
}
