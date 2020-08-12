package climbStairs;
/*2020.08.08
动态规划
time complexity：O(N)
space complexity：O(N)
*/
public class Solution3 {
    public int climbStairs(int n) {
        if(n < 3) return n;

        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
