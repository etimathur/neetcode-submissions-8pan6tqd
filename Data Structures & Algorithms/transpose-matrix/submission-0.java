class Solution {
    public int[][] transpose(int[][] m1) {
        int[][] m = new int[m1[0].length][m1.length];
        for(int i = 0; i < m1[0].length; i++) {
            for(int j = 0; j < m1.length; j++) {
                m[i][j] = m1[j][i];
            }
        }
        return m;
    }
}