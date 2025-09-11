package Lecture_30_Recursion;

import java.util.Scanner;

public class KMultiples {
    static void getMultiples(int num,int k){
        //Base Case
        if(k==0){
            return;
        }
        //Recursive Work
        getMultiples(num, k-1);

        //Self-Work
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();
        getMultiples(num, k);
    }
}