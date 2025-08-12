package Lecture_7;

import java.util.Scanner;
public class BorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row of the rectangle :");
        int r = sc.nextInt();

        System.out.print("Enter the columns of the rectangle :");
        int c = sc.nextInt();

        for(int i = 1 ; i <= r ; i++){
            for(int j = 1; j <= c ; j++){
                if( i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
