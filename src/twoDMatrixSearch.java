public class twoDMatrixSearch {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int l = 0;
            int r = m * n - 1;
            boolean fnd = false;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                int row = mid / n;
                int c = mid % n;
                int midVal = matrix[row][c];
                System.out.println("m" + m);
                System.out.println("n" + n);
                 System.out.println("right" + l);
                 System.out.println("left" + r);
                 System.out.println("mid" + mid);
                 System.out.println("row" + row);
                 System.out.println("col" + c);
                 System.out.println("midVal" + midVal);
                 System.out.println("-----------------");
                if (midVal == target) {
                    fnd = true;
                    break;
                } else if (midVal < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return fnd;
        }

    public static void main(String[] args) {
        twoDMatrixSearch obj = new twoDMatrixSearch();
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
            System.out.println(obj.searchMatrix(matrix, 7));

    }
}
