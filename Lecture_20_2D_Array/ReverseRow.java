import java.util.Scanner;

public class ReverseRow {
    
    static void reversedInPlace(int[][] arr,int r,int c){
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
        print2DArray(arr);
    }

    static void reversed(int[][] arr,int r,int c){
        int[][] reversedArray = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reversedArray[i][j] = arr[i][c - 1 - j];
            }
        }
        print2DArray(reversedArray);
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

        System.out.println("Enter the elements for the 2D array: ");
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j <c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The reversed rows of 2D array : ");
        System.out.println("Not In Place: ");
        reversed(arr, r, c);
        System.out.println("In-Place: ");
        reversedInPlace(arr,r,c);
        sc.close();
        
    }
}
