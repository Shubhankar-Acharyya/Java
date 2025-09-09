package JavaOneShotL2;

import java.util.Scanner;
public class DivisibleByFiveButNotByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int n = sc.nextInt();

        if(n%5 == 0 && n%3 != 0){
            System.out.println("Divisible by 5 but not by 3.");
        }
        else{
            System.out.println("Divisible By both 5 and 3");
        }
        sc.close();
    }
}
