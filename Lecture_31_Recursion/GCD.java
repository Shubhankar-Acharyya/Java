package Lecture_31_Recursion;

public class GCD {
    static int GCDEuclid(int m, int n){ // Recursive Process
        if (m == 0 && n == 0) {
            throw new IllegalArgumentException("GCD is undefined for both inputs being 0.");
        }
        if(n==0){
            return m;
        }
        return GCDEuclid(n, m%n);
    }
    static int GC(int m,int n){     //where m>n;
        if (m == 0 && n == 0) {
            throw new IllegalArgumentException("GCD is undefined for both inputs being 0.");
        }
        if(n==0){
            return m;
        }
        if(m == 0){
            return n;
        }
        while(m%n!=0){
            int rem = m%n;
            m = n;
            n = rem;
        }
        return n;  
    }
    public static void main(String[] args) {
        int m = 15;
        int n = 6;

        System.out.println("GCD is: "+GC(m, n));
        int GCD = GCDEuclid(m, n);
        System.out.println("GCD is: "+GCDEuclid(m, n));
        int LCM = (m*n)/GCD;
        System.out.println("LCM is: "+LCM);
    }
}
