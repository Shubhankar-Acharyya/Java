package Lecture_33_Recursion;

public class IsSorted {
    static boolean sorted(int[] arr,int idx){
        //Base case
        if(idx == arr.length-1){
            return true;
        }
        //Recursive work + Self Work
        if (arr[idx] <= arr[idx + 1] && sorted(arr, idx + 1)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,5};
        if(sorted(arr, 0)==true){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
