package JavaOneShotL2;

import java.util.Scanner;
public class $NestedLeargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number(A): ");
        int a = sc.nextInt();

        System.out.print("Enter second Number(B): ");
        int b = sc.nextInt();
        
        System.out.print("Enter third Number(C): ");
        int c = sc.nextInt();


        if(a>b){
            if(a>c){
                System.out.println(a+ " is leargest.");
            }
            else{
                System.out.println(c+ " is leargest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " is leargest");
            }
            else{
                System.out.println(c+ " is leargest.");
            }
        }
    }
}
