package JavaOneShotL2;

import java.util.Scanner;
public class RectangleSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the rectangle: ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth of the rectangle: ");
        float b = sc.nextFloat();

        if(l==b){
            System.out.println("The rectangle is a square. ");
        }
        else{
            System.out.println("The rectangle is not a square.");
        }
    }
}
