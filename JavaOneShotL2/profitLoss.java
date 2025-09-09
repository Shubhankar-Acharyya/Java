package JavaOneShotL2;

import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        int cost = sc.nextInt();

        System.out.print("Enter selling price: ");
        int sell = sc.nextInt();

        int pl = (sell-cost); //pl = profit/loss

        if(pl>0){ //sell>cost
            System.out.println("Congratulations! You have made a profit.");
            System.out.println("The amount of Profit is :"+pl);
        }
        else{ //sell<cost
            System.out.println("Sorry, you have incurred loss.");
            System.out.println("The amount of loss is : "+pl);
        }
        sc.close();
    }
}
