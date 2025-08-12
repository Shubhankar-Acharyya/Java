import java.util.Scanner;

public class BasicsOf2D {
    static int[][] getInput2Darray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's take input for your array: ");

        System.out.print("Enter the no of ROWS: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of COLS: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                System.out.println("Enter "+i+"th row and "+j+"th column: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
        
    }
    static void print2DArray(int[][] arr){
        System.out.println("Your 2D array is: ");
        for(int i = 0; i< arr.length; i++){ //row
            for(int j = 0; j< arr[i].length;j++){//colummn
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][] arr = getInput2Darray();
        
        print2DArray(arr);
        
    }
}
