package JavaOneShotL1;

public class Increment {
    public static void main(String[] args) {
        int x = 5;

        /* 
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++; //its same as x = x+1
        System.out.println(x);
        x--; //same as x = x-1
        System.out.println(x);
        */
        System.out.println(x++); //Prints the value of x (or use the value of x) and then adds 1 to x
        System.out.println(x);

        System.out.println(++x); //Adds 1 first to x then prints x(uses the value of x)

        x = 10;
        --x;
        System.out.println(x);
        ++x;
        System.out.println(x); //Adds 1 first to x then prints x


    }
}
