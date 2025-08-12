package Lecture_4;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle:");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest:");
        float r = sc.nextFloat();

        System.out.print("Enter time period:");
        float t = sc.nextFloat();

        float si = (p * r * t)/100;
        System.out.println("Your Simple Interest is: "+si);
    }
    

}
