package Lecture_32_Recursion;

public class MaxValue {
    static int max(int[] arr,int idx){
        //Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }

        // Small problem --> max of idx + 1 to end
        int smallAns = max(arr, idx+1);

        //Self Work
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,12,8,7};
        //int idx = 0;
        System.out.println(max(arr,0));
    }
}
