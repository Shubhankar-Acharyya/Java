package Lecture_15_Arrays2;
import java.util.Scanner;
// class takeInput{
//     void getInput(){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of Array: ");
//         int n = sc.nextInt();

        
//         int[] arr = new int[n];
//         System.out.print("Enter array Elements: ");
//         for(int i = 0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
    

//         System.out.print("Enter the value: ");
//         int x = sc.nextInt();
//     }
// }
public class ElementsGreaterThen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    

        System.out.print("Enter the value: ");
        int x = sc.nextInt();

        int count = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("No of digits greater than "+x+" is: "+count);
    }
}
