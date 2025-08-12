package Lecture_15_Arrays2;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        if(arr.length <= 1){
            System.out.println("Sorted");
            return;
        }

        for(int i = 0;i < arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
            else{
                flag = true;
            }

        }
        if(flag == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
