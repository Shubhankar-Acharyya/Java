package JavaOneShotL2;

import java.util.Scanner;
public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();

        if(n%5 == 0 && n%3 == 0){
            System.out.println("The number is divisible by 5 and 3.");
        }
        else{
            System.out.println("Not divisible by 5 and 3.");
        }
    }
}
