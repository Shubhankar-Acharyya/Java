package Lecture_7;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        int fact = 1;
        
        for(int i = 1; i <= n; i++){
            fact = fact*i;
            //System.out.println(fact); //To print fact till n
        }
        System.out.println(fact);   //To print fact of n
    }
}
