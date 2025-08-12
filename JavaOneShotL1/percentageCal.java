package JavaOneShotL1;

public class percentageCal {
    /* 
    public static void main(String[] args) {
        double x1 = 100, x2 = 92, x3 = 90, x4 = 86, x5 = 77;

        double percentage = (x1 + x2 + x3 + x4 + x5)/5;
        System.out.println(percentage);
    }
    */

    //Calculate percentage marks of 4 subjects with highest 60 marks!
    public static void main(String[] args) {
        double x1 = 53,x2 = 60, x3 = 55 , x4 = 50;
        double percentage = ((x1+x2+x3+x4)/(4*60))*100;
        System.out.println(percentage);
    }
}
