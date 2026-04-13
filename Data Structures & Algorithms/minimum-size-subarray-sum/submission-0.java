class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0, l = Integer.MAX_VALUE;
        for(int j = 0; j< nums.length; j++) {
            sum += nums[j];
            while(sum >= target) {
                l = Math.min(j - i + 1, l);
                sum -= nums[i];
                i++;
            }
        }
        return l == Integer.MAX_VALUE ? 0 : l;
    }
}