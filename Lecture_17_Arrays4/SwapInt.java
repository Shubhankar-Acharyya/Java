package Lecture_17_Arrays4;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;


public class SwapInt {
    //Normal TempSwap
    static void tempSwap(int a,int b){
        System.out.println("Original Values before swap: ");
        System.out.println("a: " +a);
        System.out.println("b: "+b);

        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("Values after swap: ");
        System.out.println("a: " +a);
        System.out.println("b: "+b);
        }

        //Without using temp
        static void swap(int a,int b){
        System.out.println("Original Values before swap: ");
        System.out.println("a: " +a);
        System.out.println("b: "+b);

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Values after swap: ");
        System.out.println("a: " +a);
        System.out.println("b: "+b);
        }
    public static void main(String[] args) {
        //Input taking of array
        int a = 9;
        int b = 3;
        int[] arr = {1,2,3,4,5};
        swap(a,b);
        
    }
}
