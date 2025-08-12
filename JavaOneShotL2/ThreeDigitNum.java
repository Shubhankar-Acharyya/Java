package JavaOneShotL2;

import java.util.Scanner;
public class ThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //&& is when both the conditions should meet!
        if(n>99 && n<1000){
            System.out.println("This is a three digit number.");
        }
        else{
            System.out.println("This is not a three digit number.");
        }
    }
}
