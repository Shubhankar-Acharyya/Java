package Lecture_40_Sorting_Problems;

public class LexicographicalOrderSorting {  //Based on selection Sort
    static void LexicoSort(String[] fruits){
        int n = fruits.length;

        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j = i+1;j<n ; j++){
                if(fruits[j].compareTo(fruits[min_idx]) < 0){   //s1.comapreTo(s2) --> returns + or - ve integers
                    min_idx = j;
                }
            }
            //Swap fruits[min_idx],fruits[i]
            String temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        LexicoSort(fruits);
        for(String s:fruits){
            System.out.print(s+" ");
        }
    }
}
