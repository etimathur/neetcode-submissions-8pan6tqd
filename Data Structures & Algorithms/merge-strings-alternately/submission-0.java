class Solution {
    public String mergeAlternately(String word1, String word2) {
        String r = "";
        int i = 0;

        for(i = 0; i < word1.length() && i < word2.length(); i++)
        {
            r += word1.charAt(i) + "" + word2.charAt(i);
        }

        if(i < word1.length())
            r += word1.substring(i, word1.length());

        if(i < word2.length())
            r += word2.substring(i, word2.length());

        return r;
    }
}