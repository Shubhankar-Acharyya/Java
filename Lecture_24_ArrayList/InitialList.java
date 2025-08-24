package Lecture_24_ArrayList;

import java.util.*;

public class InitialList {
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);

        //Initialization of list
        ArrayList<Integer> l1 = new ArrayList<>();

        //add new element at the end
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //Printing a single element
        System.out.println(l1.get(1));  //6

        //printing list with loop
        for(int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));  //5 6 7 8
        }

        //printing list directly
        System.out.println(l1); //[5,6,7,8]

        //adding element at some index i
        l1.add(1,100); //first is index second is the element
        System.out.println(l1);

        //Modifying element at index i
        l1.set(1,10);   //sets element at index 1 as 10
        System.out.println(l1);

        //Remove a particular element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));  //returns boolean t/f--> if +ve & -ve
        System.out.println(l1);

        //check if element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        ArrayList l = new ArrayList();
        l.add(1);
        l.add("pqres");
        l.add(true);
        System.out.println(l);
    }
}
