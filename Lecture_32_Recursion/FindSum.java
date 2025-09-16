package Lecture_32_Recursion;

public class FindSum {
    static int getSum(int[] arr,int idx){
        //Base case
        if(idx==arr.length){
            return 0;
        }
        //Recursive Work
        int sum = getSum(arr, idx+1);
        //Self Work
        return sum + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(getSum(arr, 0));
    }
}
