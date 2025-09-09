package Lecture_6;

import java.util.Scanner;
public class AgeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int n = sc.nextInt();
        

        if(n<12){
            System.out.println("Child");
        }
        else if(12<=n && n<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
        sc.close();
    }
}
