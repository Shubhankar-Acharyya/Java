package Lecture_40_Sorting_Problems;

public class MoveZeros {    
    static void moveZeroBestApproach(int[] arr) {   //O(n^2) complexity
        int n = arr.length;
        int j = 0; // points to position of first zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    static void moveZero(int[] arr){    //O(n^2) Complexity
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]==0 && arr[j]!= 0){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0,5,0,3,4,2};
        moveZeroBestApproach(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
