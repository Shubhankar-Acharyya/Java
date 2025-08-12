import java.util.Scanner;

public class ArrayMul2D {
    static void MulOf2DArray(int r1,int c1,int[][] arr1,int r2,int c2,int[][] arr2){

        int[][] MultipliedArray = new int[r1][c2];

        if(c1 != r2){
            System.out.println("Multiplication Not Possible.");
            return;
        }
        else{
            for(int i = 0; i<r1;i++){
                for(int j = 0 ; j<c2;j++){
                    MultipliedArray[i][j] = 0;
                    for(int k = 0; k<c1;k++){
                        MultipliedArray[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }
        System.out.println("The Multiplied 2D array of size "+r1+"*"+c2+" is: ");
        print2DArray(MultipliedArray);
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
        System.out.println("Let's take input for your 1st array: ");
        
        System.out.print("Enter the no of ROWS for 1st array: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the no of COLS for 1st array: ");
        int c1 = sc.nextInt();

        System.out.println("Enter the elements for the first 2D array: ");
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter "+r1*c1+" elements: ");
        for(int i = 0; i<r1;i++){
            for(int j = 0; j <c1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Let's take input for your 2nd array: ");
        
        System.out.print("Enter the no of ROWS for 2nd array: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the no of COLS for 2nd array: ");
        int c2 = sc.nextInt();

        System.out.println("Enter the elements for the second 2D array: ");
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter "+r2*c2+" elements: ");
        for(int i = 0; i<r2;i++){
            for(int j = 0; j <c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your first array is: ");
        print2DArray(arr1);
        System.out.println("Your second array is: ");
        print2DArray(arr2);

        MulOf2DArray(r1,c1,arr1,r2,c2,arr2);
        sc.close();
        
    }
}
