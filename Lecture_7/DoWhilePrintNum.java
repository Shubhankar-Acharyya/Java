package Lecture_7;

import java.util.Scanner;
public class DoWhilePrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print till: ");
        int n = sc.nextInt();

        sc.close();

        int num = 1;

        do{
            System.out.println(num);
            num++;
        } while(num<=n);
    }
}
