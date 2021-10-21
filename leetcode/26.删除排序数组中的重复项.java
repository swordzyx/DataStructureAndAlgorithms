/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        return removeDuplicates1(nums);
    }

    public int removeDuplicates1(int[] nums) {
        int i = 0;
        for (int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                i ++;
                if(i != j){
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }
}
// @lc code=end

