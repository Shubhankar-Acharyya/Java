package Lecture_30_Recursion;

public class SumOfNTillN {
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        //return Sum(n-1) + n; //--> Gets sum upto n;

        //Get sum alternate signs eg. 1-2+3-4+5;
        if(n%2==0){
            return -n + Sum(n-1);
        }
        else{
            return n + Sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }
}
