package Lecture_33_Recursion;

public class FindNum {
    static void findIndex(int[] arr,int target,int idx){
        //Base case
        if(idx>arr.length-1){
            return;
        }
        //Self Work
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        //Recursive Work
        findIndex(arr, target, idx+1);
    }
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
        int[] arr = {1,2,8,7,6,2,5};
        int target = 2;

        //Just find if present or not
        if(find(arr, target, 0) == true){
            System.out.println("Yes it is present.");
        }
        else
            System.out.println("Not present.");
        
        //Find indexes if present
        findIndex(arr, target, 0);
    }
}
