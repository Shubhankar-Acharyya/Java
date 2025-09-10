package Lecture_29_Recursion;

public class SumOfDigits {
    static int Sum(int n){
        if(n>=0 && n <= 9){
            return n;
        }
        return Sum(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(Sum(12346));
    }
}
