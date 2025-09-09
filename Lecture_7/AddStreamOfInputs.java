package Lecture_7;

import java.util.Scanner;
public class AddStreamOfInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int num = sc.nextInt();
        int sum = 0;

        do{
            sum += num;
            num = sc.nextInt();

        } while(num != -1);

        // while(num != -1){
        //     sum += num;
        //     System.out.println("Enter the number: ");
        //     num = sc.nextInt();
        // }
        System.out.println(sum);
        sc.close();
    }
}
