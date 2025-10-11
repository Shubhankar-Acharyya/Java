public class getSqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) return (int) mid;
            if (square < x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 16;
        getSqrt obj = new getSqrt();
        int result = obj.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}
