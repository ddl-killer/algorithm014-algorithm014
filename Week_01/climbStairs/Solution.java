package climbStairs;


/*2020.08.08
傻递归
time complexity：
space complexity：*/
public class Solution {

    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
