class Solution {
    public int firstMissingPositive(int[] nums) {
        int res;
        for(int i = 0; i < nums.length;)
        {
            if(nums[i] > 0 && nums[i] <= nums.length && (nums[i] - 1) < nums.length && nums[i] != nums[nums[i] - 1])
            {
                res = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = res;
            }
            else
                i++;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i+1)
                return i + 1;
        }

        return nums.length + 1;
    }
}