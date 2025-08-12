package Lecture_21_2D_Array;

import java.util.Scanner;

public class ArrayRotate {
    static void Rotated(int[][] arr){
        TransposedInPlace(arr);
        reversedInPlace(arr);
        print2DArray(arr);
    }
    static void reversedInPlace(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            int left = 0, right = c - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void TransposedInPlace(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i = 0;i<col;i++){
            for(int j = i; j<row;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
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
        System.out.println("Let's take input for your array: ");
        
        System.out.print("Enter the no of ROWS: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of COLS: ");
        int c = sc.nextInt();

        System.out.println("Enter the elements for the first 2D array: ");
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        print2DArray(arr);

        System.out.println("Transposed Matrix is: ");
        Rotated(arr);
        
        sc.close();
    }
}
