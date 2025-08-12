package Lecture_17_Arrays4;

import java.util.Scanner;

public class PresentQuery {
    //Print desired array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Create another freq array for query
    static int[] makeFreqArray(int[] arr){
        int[] freq = new int[100005];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFreqArray(arr);
        System.out.println("Enter num of Queries:");
        int q = sc.nextInt();

        while(q>0){

            System.out.println("Enter num to be seaarched: ");
            int x = sc.nextInt();

            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
        sc.close();
    }
}
