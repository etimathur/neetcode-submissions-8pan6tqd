class Solution {
    public int maxArea(int[] heights) {
        // int m = 0;
        // for(int i =0; i< heights.length; i++) {
        //     for(int j =i+1; j<heights.length; j++) {
        //         if(m < Integer.min(heights[i], heights[j]) * (j - i))
        //             m = Integer.min(heights[i], heights[j]) * (j - i);
        //     }
        // }
        // return m;

        int l = 0, r = heights.length - 1, m = 0;
        while (l<r) {
            int a = Math.min(heights[l], heights[r]) * (r - l);
            m = Math.max(m, a);
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return m;
    }
}
