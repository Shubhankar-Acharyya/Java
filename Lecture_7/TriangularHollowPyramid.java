package Lecture_7;

import java.util.Scanner;
public class TriangularHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){

            //print spaces of outer 
            for(int j = 1; j <= r-1;j++){
                System.out.print(" ");
            }
            //prints numbers
            for(int k = 1; k <= r;k++){
                System.out.print(k);
            }
            //prints hollow
            //for(int l = )

            System.out.println();
        }
    }
}
