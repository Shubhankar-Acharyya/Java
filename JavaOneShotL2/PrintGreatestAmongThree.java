package JavaOneShotL2;

import java.util.Scanner;
public class PrintGreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Integer:: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Integer:: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Integer:: ");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("The greatest number is :"+a); // can also be written as System.out.println(a+ "is Largest"); 
        }
        else if(b>a && b>c){
            System.out.println("The greatest number is : "+b);
        }
        else{
            System.out.println("The greatest number is : "+c);
        }
        sc.close();
    }
}
