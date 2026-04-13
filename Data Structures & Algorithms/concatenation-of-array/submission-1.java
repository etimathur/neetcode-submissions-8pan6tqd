class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] num = new int[n];
        for(int i = 0; i < n;i++)
        {
            num[i] = nums[i%nums.length];
        }   
        return num;
    }
}