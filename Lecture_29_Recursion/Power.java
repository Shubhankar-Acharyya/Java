package Lecture_29_Recursion;

public class Power{
    static int OGpow(int p,int q){  //O(q) complexity
        if(q==0)
            return 1;
        return p*OGpow(p, q-1);
    }
    static int pow(int p, int q){   //Better complexity --> O(log q)
        if(q==0)
            return 1;
        int smallPow = pow(p, q/2);
        if(q%2==0){
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(OGpow(2, 5));
    }
}
