public class TransposeMatrix {

        // 867. Transpose Matrix
    // Given a 2D integer array matrix, return the transpose of matrix.

    // The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

    //     Example 1:

    // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[1,4,7],[2,5,8],[3,6,9]]
    // Example 2:

    // Input: matrix = [[1,2,3],[4,5,6]]
    // Output: [[1,4],[2,5],[3,6]]




    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        int transMatrix[][] = new int[m][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                transMatrix[j][i] = matrix[i][j];
                // System.out.print(transMatrix[j][i]+"  ");
            }
        }
    return transMatrix;

    }


    public static void main(String[] args) {
        int matrix[][] = {
            {2,4,-1},
            {-10,5, 11},
            {18,-7,6}
        };
        int result[][] =  (transpose(matrix));

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
