package Lecture_34_Recursion;

public class ReverseString {
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
        String str = "abcd haluwa";
        System.out.println(reverse(str,0));
    }
}
