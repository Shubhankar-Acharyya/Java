import java.util.Scanner;

public class SumOf2DArrays {
    static int[][] SumOf2DArray(int[][] arr1,int[][] arr2){

        int[][] sumArray = new int[arr1.length][arr1[0].length];
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                sumArray[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return sumArray;
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
        int[][] arr1 = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for the second 2D array: ");
        int[][] arr2 = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
    

        int[][] ans = SumOf2DArray(arr1,arr2);
        
        System.out.println("The sum of the two 2D arrays is: ");
        print2DArray(ans);
        sc.close();
        
    }
}
