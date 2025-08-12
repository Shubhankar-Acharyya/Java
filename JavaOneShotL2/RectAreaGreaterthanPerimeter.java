package JavaOneShotL2;

import java.util.Scanner;
public class RectAreaGreaterthanPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        float l = sc.nextFloat();

        System.out.println("Enter the breadth of the rectangle: ");
        float b = sc.nextFloat();

        float area = l * b;
        float peri = 2*(l+b); //peri = perimeter which is sum of all the 2 breadth and 2 lengths

        if(area>peri){
            System.out.println("Area is greater than perimeter.");
        }
        if(area==peri){
            System.out.println("Area is same as perimeter.");
        }
        else{
            System.out.println("Area is less than perimeter.");
        }
    }
}
