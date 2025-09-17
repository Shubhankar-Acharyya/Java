package Lecture_34_Recursion;

public class RemoveOccurences {
    static String get(String str,char target,int idx){
        //Self Work
        if (idx == str.length()) {
            return "";
        }
        // Recursive Case
        String smallAns = get(str, target, idx + 1);
        if (str.charAt(idx) != target) {
            return str.charAt(idx) + smallAns;
        } else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        String str = "abcax";
        char target = 'a';
        System.out.println(get(str, target,0));
    }
}
