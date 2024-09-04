class SumOfBoundary:
    def __init__(self, matrix):
        self.matrix=matrix
    
    def calculateSumOfBoundary(self):
        numRows = len(self.matrix)
        numColumns = len(self.matrix[0])
        sum = 0

        for i in range(numRows):
            for j in range(numColumns):
                if i==0 or j==0 or i==numRows-1 or j==numColumns:
                    sum+=self.matrix[i][j]

        return sum
