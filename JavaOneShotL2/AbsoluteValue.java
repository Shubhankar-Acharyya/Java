package JavaOneShotL2;

import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Your absolute value will be : "+n);
        }
        else{

            int value = n*(-1); // same as n = n*(-1);
            System.out.println("Your absolute value will be :"+value);
        }
    }
}
