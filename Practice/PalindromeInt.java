import java.util.Scanner;

public class PalindromeInt {
    static boolean palin(String str,int left,int right){
        //Base Case
        if(left>=right){
            return true;
        }
        //Recursive Work
        boolean smallAns = palin(str, left+1, right-1);
        //Self Work
        if(smallAns==false){
            return false;
        }
        else{
            return str.charAt(left)==str.charAt(right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.close();
        String str = String.valueOf(q);
        int n = str.length();
        if(palin(str, 0, n-1)==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
