package Lecture_33_Recursion;

public class FindLastIndex {
    static int getIndex(int[] arr,int idx,int target){
        //Base Case
        if(idx==arr.length){
            return -1;
        }
        //Recursive Work and Self Work
        int smallAns = getIndex(arr, idx+1, target);
        if (smallAns != -1) {
            return smallAns;
        } else {
            if (arr[idx] == target) {
                return idx;
            } else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6};
        int target = 2;
        System.out.println(getIndex(arr, 0, target));
    }
}
