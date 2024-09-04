public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {10, 20, 30}, {100, 200, 300}};

        SumOfBoundary sumOfBoundaryCalculator = new SumOfBoundary(matrix);

        int sumOfBoundary = sumOfBoundaryCalculator.calculateSumOfBoundary();
        System.out.println("Sum Of The Boundary Elements: " + sumOfBoundary);
    }
}