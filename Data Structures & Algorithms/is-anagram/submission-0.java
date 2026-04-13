class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        String new1 = new String(s1);
        String new2 = new String(s2);

        if(new1.equals(new2))
            return true;
        return false;
    }
}
