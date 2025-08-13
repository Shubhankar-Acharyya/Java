package Lecture_23_2D_Array;

import java.util.Scanner;

public class RectangleSumPrefixSum {
    static void findPrefixSum(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        //Traverse horizontally to calc row-wise prefix sum
        for(int i = 0; i < r;i++){
            for(int j = 1; j< c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }
    static int PrefixSum(int[][] arr,int l1,int r1,int l2,int r2){
        int sum = 0;
        findPrefixSum(arr);
        for(int i = l1; i <= l2 ; i++){
            // r1 to r2 sum for row i
            if(r1>=1)
                sum += arr[i][r2] - arr[i][r1-1];
            else
                sum += arr[i][r2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's take input for your array: ");
        
        System.out.print("Enter the no of ROWS: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of COLS: ");
        int c = sc.nextInt();

        System.out.println("Enter the elements for the 2D array: ");
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the first point of the rectangle: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.println("Enter the second point of the rectangle: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum: "+PrefixSum(arr, l1, r1, l2, r2));
        sc.close();
        
    }
}
