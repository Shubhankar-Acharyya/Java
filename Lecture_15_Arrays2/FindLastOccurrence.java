package Lecture_15_Arrays2;

import java.util.Scanner;

// class LastOccurrence{
//     void takeInput(){
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of Array: ");
        // int n = sc.nextInt();

        
        // int[] arr = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
//     }
// }
public class FindLastOccurrence {
    public static void main(String[] args) {
        // LastOccurrence obj = new LastOccurrence();
        // obj.takeInput();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();

        int lastOccurrence = -1;
        
        for(int i = 0;i<arr.length;i++){
            if(searchElement == arr[i]){
                lastOccurrence = i;
            }
        }
        System.out.println(lastOccurrence);
        sc.close();
    }
}
