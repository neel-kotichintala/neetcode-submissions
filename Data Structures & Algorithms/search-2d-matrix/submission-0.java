class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = m * n - 1;

        while (l <= r) {
            int mid = (r - l) / 2 + l;
            int row_mid = mid / n;
            int col_mid = mid % n;
            if (target == matrix[row_mid][col_mid]) {
                return true;
            } else if (target > matrix[row_mid][col_mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;

    }
}
