package Lecture_14_Arrays;
class ArraysExample{
    void multiArrays(){
        int[][] arr_1 = new int[5][3];
        int[][] arr = {{56,43,6},{34,7,8},{12,56,8}};

        int[][][] arr_3 = new int[5][3][2];
        arr_3[0][0][0] = 1;

        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[0][2]);

        // System.out.println(arr_3[0][0][0]);

        // System.out.println(arr_1.length);
        
        int[][] newArr = {{56,43,6},{34,7,8}};

        for(int i = 0;i<newArr.length;i++){    //newArr.length is 2
            for(int j = 0 ;j<newArr[i].length;j++){    //newArr[i].length is 3
                System.out.println("Multi array : "+newArr[i][j]);
            }
        }
    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"rahul","rajiv","anu"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

        weights[0] = 23.8f;
        weights[1] = 87.5f;


        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        
        for(int i = 0;i<3;i++){
            System.out.println("For loop : "+ages[i]);    //34 12 45
        }

        for(int age: ages){
            System.out.println("For each loop : "+age);    //For each loop
        }
        int i = 0;
        while(i<3){
            System.out.println("While loop: "+ages[i]);
            i += 1;
        }
        

        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);

    }
}
public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        // obj.demoArrays();
        obj.multiArrays();
    }
}
