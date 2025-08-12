package JavaOneShotL1;

public class MultipleVariables {
    public static void main(String[] args) {
        
        // int x = 5;
        // int y = 6;
        // int z = 7; - is same as : 

        int x = 5, y = 6, z = 7;

        System.out.print("The value of x is : ");
        System.out.println(x);
        System.out.print("The value of y is : ");
        System.out.println(y);
        z = 10;
        z = x;
        z = x + y;
        System.out.println("The value of x is : "+z); //If there's a +variable after a text("") then the variable is converted to text.

        System.out.println(z);
        System.out.println(x+y+z);
        System.out.println("" +x+y+z); //x,y,z converted to text
        System.out.println(x+y+""+z); //x+y is integer but x+y+" " becomes text

    }
    
}
