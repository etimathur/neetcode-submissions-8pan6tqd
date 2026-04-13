class Solution {
    public int removeDuplicates(int[] num) {
        int n = num.length, l = 0, r = 0;
        while (r < n) {
            num[l] = num[r];
            while(r < n && num[r] == num[l]) {
                r++;
            }
            l++;
        }  
        return l;
    }
}