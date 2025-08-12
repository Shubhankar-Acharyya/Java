package Lecture_7;

import java.util.Scanner;
public class PrintNumbersInDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num to print in descending order: ");
        int n = sc.nextInt();

        for(int num = n; num >= 1 ; num--){
            System.out.println(num);
        }
    }
}
