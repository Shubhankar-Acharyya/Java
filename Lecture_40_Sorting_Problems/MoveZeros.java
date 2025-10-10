package Lecture_40_Sorting_Problems;

public class MoveZeros {
    static void moveZero(int[] arr){
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
        moveZero(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
