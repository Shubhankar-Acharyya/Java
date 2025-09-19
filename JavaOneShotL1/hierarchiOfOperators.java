package JavaOneShotL1;

public class hierarchiOfOperators {
    public static void main(String[] args) {
        //Problem 1::
        int i = 2*3/4+7/4+8-2+5/8;
        System.out.println(i);

        //Problem 2::
        int m = 2, j = 3;
        double a = j/m*m; // j and m are int type so the value of j/m is calculated based on int then the whole value stored as double

        System.out.println(a);
        //Divide the whole eq^n into parts by + and - and then do / and * first and then + and - from left to right
        //Bracets first --> %,*,/ --> +,-
    }
}
