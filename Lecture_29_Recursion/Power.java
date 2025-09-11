package Lecture_29_Recursion;

public class Power{
    static long pow(int p, int q){
        if(q==0)
            return 1;
        return p*pow(p, q-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
