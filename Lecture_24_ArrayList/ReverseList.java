package Lecture_24_ArrayList;

import java.util.*;

public class ReverseList {
    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;

        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
        System.out.println("ArrayList after reverse:" +list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter num of List elements: ");
        int n = sc.nextInt();

        System.out.print("Enter List elements: ");
        for(int i = 0; i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList before reverse:" +list);

        reverseList(list);

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
