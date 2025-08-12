package JavaOneShotL2;

import java.util.Scanner;
public class CirclePoaition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-axis of the centre of circle: ");
        int x = sc.nextInt();

        System.out.print("Enter y-axis of the centre of circle: ");
        int y = sc.nextInt();

        System.out.print("Enter radius of the circle: ");
        int r = sc.nextInt();

        System.out.print("Enter x-axis of the centre of Point: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y-axis of the centre of Point: ");
        int y1 = sc.nextInt();

        if(((x-x1)*(x-x1))+((y-y1)*(y-y1))>(r*r)){
            System.out.println("The point lies outside the circle.");
        }
        else if(((x-x1)*(x-x1))+((y-y1)*(y-y1))<(r*r)){
            System.out.println("The point lies inside the circle.");
        }
        else{
            System.out.println("Point lies on the circle.");
        }
    }
}
