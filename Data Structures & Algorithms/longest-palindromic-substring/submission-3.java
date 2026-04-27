class Solution {
    public String longestPalindrome(String s) {
        
        String res = "";
        int l = 0, r = 0;
        if(s.length() == 1)
            return s;

        for(int i = 0; i < s.length(); i++){
            l = i-1;
            r = i+1;
            while(l >= 0 && r < s.length() &&  s.charAt(l) == s.charAt(r))
            {
                l--;
                r++;
            }
            if(res.length() < (r-l-1))
                res = s.substring(l+1, r < s.length() ? r: s.length());

            l = i-1;
            r = i;
            while(l >= 0 && r < s.length() &&  s.charAt(l) == s.charAt(r))
            {
                l--;
                r++;
            }
            if(res.length() < (r-l-1))
                res = s.substring(l+1, r < s.length()? r: s.length());

        }
        return res;
    }
}
