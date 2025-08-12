package Lecture_22_2D_Array;

import java.util.Scanner;

public class SpiralMatrix {
    static void printSpiralOrder(int[][] arr,int r,int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;

        int totalElements = 0;
        while(totalElements < r*c){
            //topRow -> leftCol to rightCol

            for(int j = leftCol;j<=rightCol && totalElements < r*c;j++){
                System.out.print(arr[topRow][j]+ " ");
                totalElements++;
            }
            topRow++;
            
            //rightCol -> topRow to bottomRow
            for(int i = topRow;i<=bottomRow && totalElements < r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int j = rightCol;j>=leftCol && totalElements < r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && totalElements < r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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

       printSpiralOrder(arr,r,c);
        sc.close();
    }
}
