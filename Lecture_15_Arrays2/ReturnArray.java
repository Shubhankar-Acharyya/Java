package Lecture_15_Arrays2;

import java.util.*;

public class ReturnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        System.out.println(Arrays.toString(ans));

        sc.close();
        }
    }
