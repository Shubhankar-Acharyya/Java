package Lecture_35_Recursion;

public class SumOfAllSubsets {
    static void printSum(int[] arr, int n,int idx, int sum){
        if(idx>=n){
            System.out.print(sum+" ");
            return;
        }
        //curr idx + sum
        printSum(arr, n, idx+1, sum+arr[idx]);
        //exclude current sum
        printSum(arr, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        int n = arr.length;
        printSum(arr,n,0,0 );

    }
}
