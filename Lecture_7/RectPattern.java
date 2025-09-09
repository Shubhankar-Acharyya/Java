package Lecture_7;

import java.util.Scanner;
public class RectPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns for the rectangle: ");
        int c = sc.nextInt();

        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
