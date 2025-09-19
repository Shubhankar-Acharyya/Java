package Lecture_35_Recursion;

import java.util.ArrayList;

public class ReturnSubStrings {
    static void printSS(String str,String currAns){
        if(str.length()==0){
            System.out.print(currAns+" ");
            return;
        }
        char curr = str.charAt(0);
        String remString = str.substring(1);

        //Iclude curr
        printSS(remString, currAns+curr);

        //Exclude curr
        printSS(remString, currAns);
    }
    static ArrayList<String> getSS(String str, int idx){
        ArrayList<String> ans = new ArrayList<>();

        //Base Case
        if(idx==str.length()){
            ans.add("");
            return ans;
        }
        char curr = str.charAt(idx);

        //Recursive Work
        ArrayList<String> smallAns = getSS(str, idx+1);

        //Self Work
        for(String s: smallAns){
            ans.add(s);
            ans.add(curr+s);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc";
        //System.out.println(getSS(str, 0));
        printSS(str, "");
    }
}
