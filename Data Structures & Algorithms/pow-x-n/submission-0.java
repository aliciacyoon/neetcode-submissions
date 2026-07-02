class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        for (int i = (int)n; i < 0; i++) {
            ans /= x;
        }
        return ans;
    }
}
