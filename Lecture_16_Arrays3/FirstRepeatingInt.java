package Lecture_16_Arrays3;

import java.util.Arrays;
import java.util.Scanner;

public class FirstRepeatingInt {
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
        int rep = -1;
        outer:
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    rep = arr[i];
                    break outer;
                }
            }
        }
        System.out.println(rep);
        sc.close();
    }
}
