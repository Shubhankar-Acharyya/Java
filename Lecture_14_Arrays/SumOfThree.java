package Lecture_14_Arrays;
import java.util.Scanner;
class SumArrays{
    void returnIndex(){
        //return the index if a number is in the array else return -1
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,5,3};

        System.out.print("Enter a number to search: ");
        int n = sc.nextInt();
        sc.close();
        boolean found = false;
        for(int i = 0; i<arr.length;i++){
            if(n == arr[i]){
                found = true;
                System.out.println(i);
                break;
            }
        }
        if(found != true){
            System.out.println("-1");
        }
    }
    void PrintLargest(){
        //print the largest number in the array
        int arr[] = {1,5,3};
        int ans = 0;
        for(int i = 0;i <arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
    void PrintSum(){
        //print the sum of all the numbers in the array

        // int[] arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 5;
        // arr[2] = 3;
        int arr[] = {1,5,3,6};


        // int ans = arr[0]+arr[1]+arr[2];
        // System.out.println(ans);
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans += arr[i];
        }
        System.out.println(ans);
        
    }
}
public class SumOfThree {
    public static void main(String args[]){
        SumArrays obj = new SumArrays();
        // obj.PrintSum();
        // obj.PrintLargest();
        obj.returnIndex();
    }
}
