package Lecture_7;

import java.util.Scanner;
public class ReverseADigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit to reverse: ");
        int n = sc.nextInt();

        int reversed = 0;

        while(n>0){
            int m = n%10;
            reversed = reversed*10 + m;
            n /= 10;    //n = n/10;
        }
        System.out.println(reversed);
    }
}
