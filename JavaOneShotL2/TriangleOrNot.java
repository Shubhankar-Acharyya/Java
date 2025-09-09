package JavaOneShotL2;

import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of side a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of side b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of side c: ");
        int c = sc.nextInt();

        sc.close();

        if(a+b > c && b+c > a && c+a > b){
            System.out.println("Triangle.");
        }
        else{
            System.out.println("Not a Triangle.");
        }
    }
}
