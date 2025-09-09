package Lecture_10_NumSystem;

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        sc.close();

        int Binary = 0;
        int Multiplier = 1;

        for(;n>0;n /= 2){

            int parity = n%2;
            Binary += (parity*Multiplier);
            Multiplier = Multiplier*10;
        }
        System.out.println(Binary);
    }
}
