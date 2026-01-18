class twoDMatrixII {
    /**
     * Search for target in a 2D matrix where rows and columns are sorted.
     *
     * Time Complexity: O(m + n) where m is rows, n is columns
     * Space Complexity: O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Start from top-right corner
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (current > target) {
                // Current value too large, move left (eliminate column)
                col--;
            } else {
                // Current value too small, move down (eliminate row)
                row++;
            }
        }

        return false;
    }

    /**
     * Alternative solution starting from bottom-left corner.
     * Same time and space complexity.
     */
    public boolean searchMatrixAlt(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Start from bottom-left corner
        int row = m - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (current > target) {
                // Current value too large, move up (eliminate row)
                row--;
            } else {
                // Current value too small, move right (eliminate column)
                col++;
            }
        }

        return false;
    }

    // Test cases
    public static void main(String[] args) {
        twoDMatrixII solution = new twoDMatrixII();

        // Example 1
        int[][] matrix1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println("Example 1 (target=5): " + solution.searchMatrix(matrix1, 5));   // true
        System.out.println("Example 2 (target=20): " + solution.searchMatrix(matrix1, 20)); // false

        // Additional test cases
        System.out.println("Corner case (target=1): " + solution.searchMatrix(matrix1, 1));   // true
        System.out.println("Corner case (target=30): " + solution.searchMatrix(matrix1, 30)); // true
        System.out.println("Edge case (target=0): " + solution.searchMatrix(matrix1, 0));     // false

        // Test alternative approach
        System.out.println("\nAlternative approach (target=5): " + solution.searchMatrixAlt(matrix1, 5)); // true
    }
}