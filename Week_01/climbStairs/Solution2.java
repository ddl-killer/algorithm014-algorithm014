package climbStairs;

/*
2020.08.08
动态规划 状态压缩
time complexity：O(N)
space complexity：O(1)
*/
public class Solution2 {

    public int climbStairs(int n) {
        //特判
        if (n < 3) return n;

        int pre=2,preOfPre=1;
        for (int i = 3; i <= n; i++) {
            int cur = pre + preOfPre;
            preOfPre = pre;
            pre = cur;
        }
        return pre;
    }
}
