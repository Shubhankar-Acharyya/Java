package JavaOneShotL1;

import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,q,r;
        System.out.println("Enter divident: ");
        a = sc.nextInt();
        System.out.println("Enter divisor: ");
        b = sc.nextInt();

        q = a/b;    //q is quotient
        r = a - (b*q);  //r is remainder

        System.out.println("The remainder when "+a+" is divided by "+b+" is "+r);
        sc.close();
    }
}
