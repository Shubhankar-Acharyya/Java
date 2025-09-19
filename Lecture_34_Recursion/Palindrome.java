package Lecture_34_Recursion;

import java.util.Scanner;

public class Palindrome {
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
    static String reverse(String str,int idx){
        //Base Case
        if(idx==str.length()){
            return "";
        }
        //Recursive Work
        String smallAns = reverse(str, idx+1);
        //Self Work
        String ans = smallAns + str.charAt(idx);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        sc.close();
        // String rev = reverse(str, 0);
        // if(rev.equals(str)){
        //     System.out.printf("%s is Palindrome",str);
        // }
        // else{
        //     System.out.printf("%s is not Palindrome",str);
        // }
        int n = str.length();
        if(palin(str, 0, n-1)==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
