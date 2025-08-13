package Lecture_23_2D_Array;

import java.util.Scanner;

public class RectangleSumBothSidePrefSum {
    // Calculate row and cols wise pref sum
    // arr[i][j] = sumRectangle((0,0) (i,j))
    static void findPrefixSum(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        //Traverse horizontally to calc row-wise prefix sum
        for(int i = 0; i < r;i++){
            for(int j = 1; j< c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //Traverse vertically to calc col-wise prefix sum
        for(int j = 0; j < c;j++){
            for(int i = 1; i < r;i++){
                arr[i][j] += arr[i-1][j];
            }
        }

    }
    static int BothSidePrefSum(int[][] arr,int l1,int r1,int l2,int r2){
        int ans = 0;
        int sum = 0, up = 0, left = 0, leftUp = 0;

        findPrefixSum(arr);

        sum = arr[l2][r2];
        if(r1>=1){
            left = arr[l2][r1-1];
        }
        if(l1>=1){
            up = arr[l1-1][r2];
        }
        if(l1>=1 && r1 >= 1){
            leftUp = arr[l1-1][r1-1];
        }

        ans = sum-up-left+leftUp;
        
        return ans;
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

        System.out.println("Rectangle sum: "+BothSidePrefSum(arr, l1, r1, l2, r2));
        sc.close();
    }
}
