class Solution {
    public int[] twoSum(int[] number, int target) {
        int l =0, r = number.length - 1;
        while (l < r) {
            int c = number[l] + number[r];
            if( c > target)
                r--;
            else if (c < target)
                l++;
            else  
                return new int[] { l + 1, r+1 };
        }  
        return new int [2];
    }
}
