package Lecture_15_Arrays2;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element :" );
        int n = sc.nextInt();
        sc.close();
        int[] arr = {5,6,5,1,5};
        int count = 0;
        int element = n;
        for(int i = 0;i<arr.length;i++){
            if(element == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
