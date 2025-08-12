package Lecture_4;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lucky Number:");
        int num_1 = sc.nextInt();

        System.out.println("Lucky Number is: " + num_1);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Name is : " + name);

        System.out.print("Enter your full name: ");
        String fullname = sc.nextLine();
        System.out.println("Full Name is :" + fullname);

        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        System.out.println("Number is : "+num);
        sc.nextLine();

        System.out.print("Enter your full name: ");
        String full_name = sc.nextLine();
        System.out.println("Full Name is :" + full_name);
    }
}
