class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        int m = 0;
        for(int i = 0; i < 26; i++)
        {
            if(s1Count[i] == s2Count[i])
                m++;
        }
        int l =0;
        for(int i = s1.length(); i< s2.length(); i++) {
            if(m == 26)
                return true;
            
            int in = s2.charAt(i) - 'a';
            s2Count[in]++;
            if(s1Count[in] == s2Count[in])
                m++;
            else if(s1Count[in] + 1 == s2Count[in])
                m--;
            
            in = s2.charAt(l) - 'a';
            s2Count[in]--;

            if(s1Count[in] == s2Count[in])
                m++;
            else if(s1Count[in] - 1 == s2Count[in])
                m--;

            l++;
        }
        return m == 26;


    }
}
