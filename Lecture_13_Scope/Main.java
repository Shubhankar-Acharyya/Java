package Lecture_13_Scope;

class Algebra {
    int a = 10;  // Type specified
    int b = 5;

    int add() {
        int p = 100;
        int q = 20;
        return p + q;
    }

    int sub() {
        return a - b;
    }
    void demo(){
        int a = 10;
        System.out.println(a);
        {
            int b = 10; //block level scope b cant be accessed outside the block
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();

        System.out.println("Addition: " + obj.add());       // prints 15
        System.out.println("Subtraction: " + obj.sub());    // prints 5
    }
}
