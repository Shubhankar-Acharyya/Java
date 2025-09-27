package Lecture_36_Recursion;

public class KeypadCombinations {
    static  void combination(String dig,String[] kp, String res){
        //Base Case
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        //Self Work and Recursive Work
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i = 0; i < currChoices.length();i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, "");
    }
}
