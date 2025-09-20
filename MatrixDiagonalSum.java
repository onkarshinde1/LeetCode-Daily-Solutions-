public class MatrixDiagonalSum {

    

// 1572. Matrix Diagonal Sum
//     Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

//  Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.
// Example 2:

// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8



// time complexity O(n)

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i = 0; i< mat.length;i++){
            sum+= mat[i][i];

            if(i != mat.length-1-i)
            sum+= mat[i][mat.length-1-i];
        }
    return sum;
    }



    public static void main(String[] args) {
         int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int result = diagonalSum(mat);
        System.out.println(result);
    }
}
