package JavaOneShotL1;

import java.util.Scanner;
public class sumOfTwoNumInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of y");
        y = sc.nextInt();

        System.out.print("Output is : ");
        System.out.println(x+y);

        sc.close();
    }
}
