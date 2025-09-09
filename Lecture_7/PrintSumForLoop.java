package Lecture_7;

import java.util.Scanner;
public class PrintSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num to get sum upto :");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;

        for(int num = 1; num <= n; num++){
            sum = sum + num;
        }
        System.out.println("Sum of Numbers : " +sum);
    }
}
