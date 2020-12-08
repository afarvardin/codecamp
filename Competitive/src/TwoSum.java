import java.util.HashMap;

/**
 * Given an array of integers,
 * RETURN indices of the two numbers such that they add up to a specific target
 *
 * Note: there is no duplicate
 *
 * [1,2,7,9,10] and target is 9
 * return [1,2]
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if( ! map.containsKey(x) ) {
                return new int[]{ map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
