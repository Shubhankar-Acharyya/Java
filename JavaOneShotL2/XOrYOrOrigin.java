package JavaOneShotL2;


import java.util.Scanner;
public class XOrYOrOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X:");
        int x = sc.nextInt();

        System.out.println("Enter Y:");
        int y = sc.nextInt();

        sc.close();

        if(x==0 && y==0){
            System.out.println("The point is at origin.");
        }
        else if(x==0 && y!=0){
            System.out.println("The point lies at X axis.");
        }
        else{
            System.out.println("The point lies at Y axis.");
        }
    }
}
