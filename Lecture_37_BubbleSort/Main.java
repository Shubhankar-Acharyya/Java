package Lecture_37_BubbleSort;

public class Main {
    static void bubbleSort(int[] a){
        int n = a.length;

        for(int i = 0; i < n-1; i++){
            boolean flag = false; //Has any swap() happened
            for(int j = 0; j < n-i-1; j++){
                //If curr > next element : swap()
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {5,4,1,2,3};
        bubbleSort(a);
        for(int i : a ){
            System.out.print(i+" ");
        }
    }
}
