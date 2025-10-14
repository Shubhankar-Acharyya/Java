package Lecture_42_QuickSort;

public class Main {
    static int partition(int[] arr,int st,int end){
        int pivot = arr[st];
        int count = 0;
        for(int i = st+1; i <= end;i++){
            if(arr[i] <= pivot)    count++;
        }
        int pivotIdx = st+count;
        swap(arr,st,pivotIdx);

        int i = st, j = end; 
        //Elements lesser || equal --> left, greater --> right side of pivot
        while(i <pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot)  i++;
            while(arr[j] > pivot)  j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr,int st,int end){
        //Base Case
        if(st>=end) return;

        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,13,8,5,10,2,4};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
