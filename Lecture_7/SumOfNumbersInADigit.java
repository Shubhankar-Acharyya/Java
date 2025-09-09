package Lecture_7;

import java.util.Scanner;
public class SumOfNumbersInADigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;


        while(n>0){
            int m = n%10;
            sum = sum + m;//sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits in " +original +" = " +sum);
        sc.close();
    }
}
