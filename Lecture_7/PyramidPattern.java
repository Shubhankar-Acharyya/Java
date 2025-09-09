package Lecture_7;

import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();

        sc.close();

        for(int i = 1; i <= r ; i++){
            
            //print r-i spaces
            for(int j = 1; j <= r - i; j++){
                System.out.print(" ");
            }

            //print 2*i - 1 stars
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
