package Lecture_39_Insertion_Sort;

public class Main {
    static void insertionSort(int[] arr){
        int n =  arr.length;

        //Let the 0th element be Sorted List element and Unsorted List starts from 1
        for(int i = 1; i < n ;i++){
            int j = i;

            while(j > 0 && arr[j]<arr[j-1]){
                //swap(arr[j],arr[j-1])
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                //Decrease j as after swap the index of the element will also decrease
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,5,4,2};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
