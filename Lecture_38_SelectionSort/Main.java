package Lecture_38_SelectionSort;

public class Main {
    static void selectSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min_index = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        selectSort(arr);
        for(int i : arr ){
            System.out.print(i+" ");
        }
    }
}
