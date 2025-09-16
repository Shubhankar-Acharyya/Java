package Lecture_33_Recursion;

import java.util.ArrayList;

public class FindIndexesArrayList {
    static ArrayList<Integer> allIndices(int[] arr, int target,int idx){
        //Base case
        if(idx>arr.length-1){
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        //Self Work
        if(arr[idx]==target){
            ans.add(idx);
        }
        
        //Recursive Work
        ArrayList<Integer> smallAns = allIndices(arr, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,2,3};
        int target = 2;
        ArrayList<Integer> ans = allIndices(arr, target, 0);
        for(Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
