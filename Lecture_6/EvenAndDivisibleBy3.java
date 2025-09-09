package Lecture_6;

import java.util.Scanner;
public class EvenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        // if(n%2 == 0){
        //     if(n%3 == 0){
        //         System.out.println("The value both even and divisible by 3 is :" +n);
        //     }
        //     else{
        //         System.out.println("Value is even but not divisible by 3");
        //     }
        // }
        // else{
        //     System.out.println("value is not even.");
        // }

        if(n%2 == 0 && n%3 == 0){
            System.out.println("The value both even and divisible by 3 is :" +n);
        }
        sc.close();
    }
}
