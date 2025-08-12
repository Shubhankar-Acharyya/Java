package Lecture_21_2D_Array;

import java.util.Scanner;

public class PascalTriangle {
    static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for(int i = 0; i<n;i++){
            //ith row has i+1 cols
            //Creating an One dim array within an array
            ans[i] = new int[i+1];

            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            //p[i][j] = p[i-1][j] + p[i-1][j-1]
            for(int j = 1; j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void print2DArray(int[][] arr){
        for(int i = 0; i< arr.length; i++){ //row
            for(int j = 0; j< arr[i].length;j++){//colummn
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of input: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        print2DArray(ans);
        
        sc.close();
    }
}
