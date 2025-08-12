package Lecture_22_2D_Array;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    static int[][] generateSpiral(int n){
        int[][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;

        int current = 1;

        while(current <= n*n){
            //topRow -> leftCol to rightCol

            for(int j = leftCol;j<=rightCol && current <= n*n ;j++){
                matrix[topRow][j] = current++;
            }
            topRow++;
            
            //rightCol -> topRow to bottomRow
            for(int i = topRow;i <= bottomRow && current <= n*n ;i++){
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int j = rightCol;j>=leftCol && current <= n*n ;j--){
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && current <= n*n ;i--){
                matrix[i][leftCol] = current++;
            }
            leftCol++;
        }
        return matrix;
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
        
        
        System.out.print("Enter your input: ");
        int n = sc.nextInt();
        
        System.out.println("Your spiral Matrix is:");
        int[][] ans = generateSpiral(n);
        print2DArray(ans);

        sc.close();
    }
}
