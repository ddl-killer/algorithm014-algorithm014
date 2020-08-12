package climbStairs;

public class Solution4 {
    public int climbStairs(int n) {
        if(n < 3) return n;

        int pre = 2, preOfPre = 1;
        for(int i = 3; i <= n; i++) {
            int temp = pre + preOfPre;
            preOfPre = pre;
            pre = temp;
        }
        return pre;
    }
}
