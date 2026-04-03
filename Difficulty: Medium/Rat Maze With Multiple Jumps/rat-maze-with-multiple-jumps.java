import java.util.*;

class Solution {

    public int[][] ShortestDistance(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        if (r == 1 && c == 1) {
            return new int[][]{{1}};
        }

        int[][] path = new int[r][c];

        if (matrix[0][0] == 0 || !ratmaze(matrix, path, 0, 0, r, c)) {
            return new int[][]{{-1}};
        }

        return path;
    }

    static boolean isValid(int i, int j, int[][] matrix, int r, int c) {
        if (i >= r || j >= c || matrix[i][j] == 0)
            return false;
        return true;
    }

    static boolean ratmaze(int[][] matrix, int[][] path,
                           int i, int j, int r, int c) {

        // Destination reached
        if (i == r - 1 && j == c - 1) {
            path[i][j] = 1;
            return true;
        }

        if (isValid(i, j, matrix, r, c)) {

            path[i][j] = 1;

            int jump = matrix[i][j];

            for (int k = 1; k <= jump; k++) {

                // Move Right
                if (ratmaze(matrix, path, i, j + k, r, c))
                    return true;

                // Move Down
                if (ratmaze(matrix, path, i + k, j, r, c))
                    return true;
            }

            // Backtrack
            path[i][j] = 0;
        }

        return false;
    }
}