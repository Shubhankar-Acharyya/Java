package JavaOneShotL2;

import java.util.Scanner;
public class GradingByMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage : ");
        int n = sc.nextInt(); //n -> percentage

        sc.close();

        if(n>90){
            System.out.println("Excellent."); //If if gets executed then other than that no other if else statement would run.
        }
        else if(n>80){
            System.out.println("Very Good.");
        }
        else if(n>70){
            System.out.println("Good.");
        }
        else if(n>60){
            System.out.println("Can do better.");
        }
        else if(n>50){
            System.out.println("Average Marks.");
        }
        else if(n>40){
            System.out.println("Below Average.");
        }
        else if(n<40){
            System.out.println("Fail.");
        }
    }
}
