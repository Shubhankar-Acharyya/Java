package Lecture_32_Recursion;

public class PrintArrayValues {
    static void printArrays(int[] arr,int idx){
        if(idx==0){
            System.out.print(arr[0]+" ");
            return;
        }
        printArrays(arr,idx-1);
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,10};
        int idx = arr.length - 1;
        printArrays(arr,idx);
    }
}
