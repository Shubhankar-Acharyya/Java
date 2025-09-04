public class LongestCommonSubstring {

    // Helper: longest common suffix of s1[0..m-1] and s2[0..n-1]
    static int LCSuf(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0 || s1.charAt(m - 1) != s2.charAt(n - 1)) {
            return 0;
        }
        return 1 + LCSuf(s1, s2, m - 1, n - 1);
    }

    // Main: check all pairs of positions
    static int longestSubString(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int res = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                res = Math.max(res, LCSuf(s1, s2, i, j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "ACDGHR";

        int ans = longestSubString(s1, s2);
        System.out.println("Length of Longest Common Substring: " + ans);
    }
}
