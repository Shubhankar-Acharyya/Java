package Lecture_24_ArrayList;

import java.util.*;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter num of List elements: ");
        int n = sc.nextInt();

        System.out.print("Enter List elements: ");
        for(int i = 0; i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList before sorting:" +list);

        Collections.sort(list);
        System.out.println("Sorted list:"+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reversed sorterd"+list);

        // //Step 1 with loop
        // System.out.println("ArrayList after reverse: ");
        // for(int i = n-1; i>=0;i--){
        //     System.out.println(list.get(i));
        // }
        // System.out.println(list);

        // //Step 2 with method
        // Collections.reverse(list);
        // System.out.println(list);

        sc.close();
    }
}
