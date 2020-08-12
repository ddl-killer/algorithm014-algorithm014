package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
2020.08.08

time complexity:O(N^2)
space complexity:O(logN)。我们忽略存储答案的空间，额外的排序的空间复杂度为O(logN)。
                   然而我们修改了输入的数组nums，在实际情况下不一定允许，
                   因此也可以看成使用了一个额外的数组存储了nums的副本并进行排序，空间复杂度为O(N)
*/

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //特判
        if(nums == null || nums.length < 3) return res;
        //排序 时间复杂度：O(N)
        Arrays.sort(nums);
        //遍历 O(N*N)
        for(int i =0; i < nums.length; i++) {
            //如果nums[i] > 0,则不可能有三个数相加为0
            if(nums[i] > 0) break;
            //跳过重复元素
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int L = i + 1;
            int R = nums.length - 1;
            //O(N)
            while(L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    //去除重复元素
                    while(L < R && nums[L] == nums[L+1]) L++;
                    while(L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                //sum < 0 L指针左移
                //sum > 0 R指针右移
                else if(sum < 0) L++;
                else R--;
            }
        }
        return res;
    }
}

