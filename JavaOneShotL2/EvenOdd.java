package JavaOneShotL2;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n%2 == 0){
            //code 4%2 = 0(even)
            System.out.println("The number you entered is even.");
        }

        else{ //if(n%2!=0)
            System.out.println("The number you entered is Odd.");
        }
    }
}
