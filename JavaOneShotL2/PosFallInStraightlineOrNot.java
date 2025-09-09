package JavaOneShotL2;

//((y2-y1)/(x2-x1)) = ((y3-y2)/(x3-x2)) //Condition to fall on One Straight Line
import java.util.Scanner;
public class PosFallInStraightlineOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X1:");
        double X1 = sc.nextDouble();

        System.out.println("Enter Y1:");
        double Y1 = sc.nextDouble();

        System.out.println("Enter X2:");
        double X2 = sc.nextDouble();

        System.out.println("Enter Y2:");
        double Y2 = sc.nextDouble();

        System.out.println("Enter X3:");
        double X3 = sc.nextDouble();

        System.out.println("Enter Y3:");
        double Y3 = sc.nextDouble();

        double m1 = (Y2-Y1)/(X2-X1);
        double m2 = (Y3-Y2)/(Y3-Y2);

        if(m1==m2){
            System.out.println("Three Points create a Straight Line.");
        }
        else{
            System.out.println("Does Not Create a Straight Line.");
        }
        sc.close();
    }
}
