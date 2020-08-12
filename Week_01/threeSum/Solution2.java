package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || nums.length < 3) return res;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int R = i + 1;
            int L = nums.length-1;
            while(R < L) {
                int sum = nums[i] + nums[R] + nums[L];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[R], nums[L]));
                    while(R < L && nums[R] == nums[R+1]) R++;
                    while(R < L && nums[L] == nums[L-1]) L--;
                    R++;
                    L--;
                }else if(sum < 0) R++;
                else L--;
            }
        }
        return res;
    }
}
