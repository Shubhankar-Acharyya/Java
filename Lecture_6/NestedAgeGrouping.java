package Lecture_6;

import java.util.Scanner;
public class NestedAgeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int n = sc.nextInt();

        if(n<=12){
            if(n<=5){
                System.out.println("Toddler");
            }
            else{
                System.out.println("Child");
            }
        }
        else if(n>12 && n<18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }
        sc.close();
    }
}
