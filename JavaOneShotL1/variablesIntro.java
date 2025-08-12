package JavaOneShotL1;

//Variables are used as containers - it allots a container in memory, for a value.
public class variablesIntro {
    public static void main(String[] args) {
        int x; // 4 bytes alloted for "int"
        x = 5;
        System.out.println(x);
        x = 10;
        System.out.println(x);
        System.out.println(x+1);

        x = x + 5;
        System.out.println(x);

        x = x - 6;
        System.out.println(x);
    }
}
