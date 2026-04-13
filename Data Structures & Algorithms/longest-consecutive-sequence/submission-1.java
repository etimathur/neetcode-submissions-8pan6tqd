class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length == 0)
            return 0;
        Arrays.sort(num);
        int r = 0, a = 1;
        for(int i = 1; i < num.length; i++) {
            if(num[i] == num[i-1] + 1) {
                a++;
            }
            else if(num[i] == num[i-1])
                continue;
            else {
                r = Math.max(r , a);
                a = 1;
            }
        }
        return Math.max(r , a);
    }
}
