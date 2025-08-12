package Lecture_7;

import java.util.Scanner;
public class FindPowerOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        System.out.print("Enter power: ");
        int b = sc.nextInt();

        int POW = 1;

        for(int i=1;i<=b;i++){
            POW = POW*a;
        }
        System.out.println(POW);
    }
}
