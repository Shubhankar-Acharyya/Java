package Lecture_12_Methods;

import java.util.Scanner;

class Algebra{
    Algebra(){
        System.out.println("Constructor called... ");   //constructor
    }
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = obj1.add(a,b);
        System.out.println("Sum is: "+ans);

        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(5.3));
        System.out.println(Math.floor(5.8));

        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(5.8));
        sc.close();
    }
}
