package JavaOneShotL2;

import java.util.Scanner;
public class TwoDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        sc.close();

        if(n>9 && n<100){ //&& is Logical AND
            System.out.println("This is a two digit number.");
        }
        else{
            System.out.println("This is not a two digit number.");
        }
    }
}
