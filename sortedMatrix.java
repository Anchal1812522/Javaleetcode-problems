public class sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1 ,3 ,5 ,7},
            {10, 11 , 16 , 20},
            {23 , 30 , 34 , 60}
        };

        int target = 3;
        boolean result = searchMatrix( matrix ,  target);
        System.out.println(result);
    }

     static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;   // start at top-right corner

        while (row < m && col >= 0) {
            int value = matrix[row][col];

            if (value == target) {
                return true;
            } else if (value > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return false; // not found
    }
}
