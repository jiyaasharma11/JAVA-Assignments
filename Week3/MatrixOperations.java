public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sums[i] += matrix[i][j];
            }
        }

        return sums;
    }

    static int[] columnSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int[] sums = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sums[j] += matrix[i][j];
            }
        }

        return sums;
    }

    static int[][] add(int[][] first, int[][] second) {
        if (first == null || second == null ||
            first.length != second.length ||
            first[0].length != second[0].length) {

            throw new IllegalArgumentException("invalid!");
        }

        int[][] res = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                res[i][j] = first[i][j] + second[i][j];
            }
        }

        return res;
    }

    static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0][0];

        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        if (first == null || second == null ||
            first.length == 0 || second.length == 0 ||
            first[0].length != second.length) {

            throw new IllegalArgumentException("invalid!");
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < first[0].length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}