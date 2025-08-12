package Lecture_10_NumSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary Number :");
        int n = sc.nextInt();

        int ans = 0;    //decimal no converted
        int pow = 1;    //power in the sense 2^0 = 1;

        while(n>0){
            int unit_digit = n%10;
            ans += (unit_digit * pow);
            n /= 10;
            pow *= 2;
        }
        System.out.println(ans);
    }
}
