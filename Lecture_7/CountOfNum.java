package Lecture_7;


import java.util.Scanner;
public class CountOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int digit = 0;

        for(; n>0; digit++){    //while(n>0){ n = n/10; digit++}
            n = n/10;
        }
        System.out.println(digit);
    }
}
