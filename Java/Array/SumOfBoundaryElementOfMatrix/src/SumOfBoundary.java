public class SumOfBoundary {
    private int[][] matrix;

    // Constructor to initialize the matrix
    public SumOfBoundary(int[][] matrix) {
        this.matrix = matrix;
    }

    // Method to calculate the sum of boundary elements
    public int calculateSumOfBoundary() {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        int sumOfBoundary = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (i == 0 || j == 0 || i == numRows - 1 || j == numColumns - 1) {
                    sumOfBoundary += matrix[i][j];
                }
            }
        }

        return sumOfBoundary;
    }
}