package JavaOneShotL1;

import java.util.Scanner;

public class moduloOperation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,r;
        System.out.println("Enter divident: ");
        a = sc.nextInt();
        System.out.println("Enter divisor: ");
        b = sc.nextInt();

        r = a%b;  //r is remainder

        //Note: If  b<a then b%a returns b or the small no. eg 5%6 = 5
        //Note: a % -b and a % b are same thing.

        System.out.println("The remainder when "+a+" is divided by "+b+" is "+r);
        sc.close();
    }
}
