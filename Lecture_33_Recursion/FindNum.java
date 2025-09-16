package Lecture_33_Recursion;

public class FindNum {
    static boolean find(int[] arr,int target,int idx){
        //Base Case
        if(idx>arr.length-1){
            return false;
        }
        //Self work
        if(arr[idx]==target){
            return true;
        }
        //recursive work
        return find(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,7,6,5};
        int target = 5;
        if(find(arr, target, 0) == true){
            System.out.println("Yes it is present.");
        }
        else
            System.out.println("Not present.");
    }
}
