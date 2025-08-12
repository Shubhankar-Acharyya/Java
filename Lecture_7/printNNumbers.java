package Lecture_7;

import java.util.Scanner;
public class printNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The count of Total Numbers to print: ");
        int n = sc.nextInt();

        int num = 1,sum = 0;

        while(num <= n){
            // System.out.println(num);
            sum = sum + num;
            num++; //num = num+1;
        }

        System.out.println(sum);
    }
}
