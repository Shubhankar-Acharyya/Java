package Lecture_32_Recursion;

public class PrintArrayValues {
    static void reverseWayOfPrint(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        reverseWayOfPrint(arr, idx+1);
    }
    
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

        System.out.println("Mine process: ");
        int idx = arr.length - 1;
        printArrays(arr,idx);

        System.out.println();

        System.out.println("Tutorial Process: ");
        int idx1 = 0;
        reverseWayOfPrint(arr,idx1);
    }
}
