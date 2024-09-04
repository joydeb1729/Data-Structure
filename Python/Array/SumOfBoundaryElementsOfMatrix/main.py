from SumOfBoundaryElements.SumOfBoundary import SumOfBoundary

class Main:
    def main():
        matrix = [
            [1, 2, 3],
            [4, 5, 6],
            [10, 20, 30],
            [100, 200, 300]
        ]

        sumOfBoundary = SumOfBoundary(matrix)

        sum = sumOfBoundary.calculateSumOfBoundary()

        print(f"Sum of Boundary Elements Of The Matrix: {sum}")

if __name__ == "__main__":
    Main.main()