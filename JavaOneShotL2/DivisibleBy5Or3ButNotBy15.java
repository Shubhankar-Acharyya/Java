package JavaOneShotL2;

import java.util.Scanner;
public class DivisibleBy5Or3ButNotBy15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a positive integer: ");
    int n = sc.nextInt();
    sc.close();
    
    if(n%5 == 0 || n%3 == 0){
        if(n%15 != 0){
            System.out.println("Number is not divisible by 15 but divisible by 5 or 3.");
        }
        else{
            System.out.println("Number is divisible by just 5 or 3.");
            }
    }
    else{
        System.out.println("Number is not divisible by 5 or 3");
    }
    }
}
