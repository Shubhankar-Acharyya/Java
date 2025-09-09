package Lecture_7;

import java.util.Scanner;
public class PrintNumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total numbers to print: ");
        int n = sc.nextInt();
        sc.close();

        for(int num = 1; num <= n;num++){
            System.out.println(num);
        }
    }
}
