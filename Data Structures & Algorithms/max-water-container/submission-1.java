class Solution {
    public int maxArea(int[] heights) {
        int m = 0;
        for(int i =0; i< heights.length; i++) {
            for(int j =i+1; j<heights.length; j++) {
                if(m < Integer.min(heights[i], heights[j]) * (j - i))
                    m = Integer.min(heights[i], heights[j]) * (j - i);
            }
        }
        return m;
    }
}
