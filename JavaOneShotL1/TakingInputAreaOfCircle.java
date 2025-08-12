package JavaOneShotL1;

import java.util.Scanner;
public class TakingInputAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int rad = sc.nextInt();
        double pi = 3.1415, area;
        area = pi*rad*rad;
        System.out.println("The area of circle is :"+area);

        sc.close();
    }
}
