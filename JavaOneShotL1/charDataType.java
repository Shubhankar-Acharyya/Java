package JavaOneShotL1;

import java.util.Scanner;
public class charDataType {
    public static void main(String[] args) {
    //a single letter like 'a'/'A' to 'z'/'Z','0' to '9','!' to '+' etc... is a CHARACTER!
        Scanner sc = new Scanner(System.in);
        char ch = 'A';

        System.out.println(ch);

        int x =(int)ch; //TypeCast
        System.out.println(x);

    //ASCII value of a = 97, z = 122 ; A = 65 , Z = 90

    }

}
