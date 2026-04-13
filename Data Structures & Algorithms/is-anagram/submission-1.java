class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sf = new int[26];
        for(int I =0 ; I<s.length();I++){
            sf[s.charAt(I) - 97]++;
        }
        int[] tf = new int[26];
        for(int I =0 ; I<t.length();I++){
            tf[t.charAt(I)- 97]++;
        }
        
        for(int I =0 ; I<sf.length;I++){
            if(sf[I] != tf[I])
                return false;
        }
        return true;
    }
}
