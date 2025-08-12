package Lecture_6;

import java.util.Scanner;
public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        
        if(n%3 == 0 || n%5 == 0){
            System.out.println("value is : "+n);
        }
    }
}
