package Lecture_7;

import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = 0;

        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                ans -= i;
            }
            else {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}