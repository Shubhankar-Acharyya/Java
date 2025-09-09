package Lecture_28_Recursion;

public class Factorial {
    static int FactorialOfNum(int n){
        if(n==0){
            return 1;
        }
        return n*FactorialOfNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(FactorialOfNum(5));
    }
}
