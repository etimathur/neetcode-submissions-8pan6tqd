class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int t = 0, b = matrix.length - 1, l = 0, r = matrix[0].length - 1, m;
        int row = 0;
        while(t <= b) {
            m = t + (b - t) / 2;
            if(matrix[m][0] > target) {
                b = m - 1;
            }
            else if(matrix[m][0] < target) {
                t = m + 1;
                row = m;
            }
            else {
                row = m;
                return true;
            }
        }

        while(l <= r) {
            m = l + (r-l) /2;
            if(matrix[row][m] > target) {
                r = m - 1;
            }
            else if(matrix[row][m] < target) {
                l = m + 1;
            }
            else {
                return true;
            }
        }

        return false;
    }
}
