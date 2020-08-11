/**2020.08.01
 * twoSum
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

         

        示例:

        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/two-sum
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
import java.util.HashMap;
import java.util.Map;

public class twoSum {


}

/**
2020.08.01
升维 经典的空间换取时间

时间复杂度:O(N) 只遍历了包含有 n 个元素的列表一次。在表中进行的每次查找只花费 O(1) 的时间。
空间复杂度：O(N) 所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n 个元素。
*/
class twoSum_solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no result");
    }
}
