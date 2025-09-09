package Lecture_28_Recursion;

public class Fibo{
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n+"th fibonacci number is "+fibonacci(n));
        
        System.out.println("And the series is as follows: ");
        for(int i = 0; i <= 10; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
