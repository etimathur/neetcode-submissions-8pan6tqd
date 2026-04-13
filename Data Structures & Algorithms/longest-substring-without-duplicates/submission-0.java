class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> c = new HashSet<>();
        int l = 0, res = 0;
        for(int r = 0; r< s.length(); r++){
            while (c.contains(s.charAt(r))) {
                c.remove(s.charAt(l));
                l++;
            }
            c.add(s.charAt(r));
            res = Math.max(res, r -l + 1);
        }
        return res;
    }
}
