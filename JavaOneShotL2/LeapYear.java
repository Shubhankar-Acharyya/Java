package JavaOneShotL2;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid year: ");
        int n = sc.nextInt();

        if(n%4 == 0){
            System.out.println("Entered year is a Leap Year.");
        }
        else{
            System.out.println("Entered year is not a Leap Year.");
        }
    }
}
