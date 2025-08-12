package JavaOneShotL2;

import java.util.Scanner;
public class DivisibleByFiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();

        if(n%5 == 0 || n%3 == 0){   // || is Logical OR
            System.out.println("The number is divisible by 5 or 3.");
        }
        else{
            System.out.println("The number is not divisible by 5 or 3.");
        }
    }
}
