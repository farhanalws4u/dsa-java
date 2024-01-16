package interview_self_paced.Section_two_Basic_DSA.Array;

public class RotateMatrixNinetyDegree {
    public static void rotate(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - i][j];
                matrix[row - 1 - i][j] = temp;
            }
        }

        for (int k = 0; k < row; k++) {
            for (int l = k + 1; l < col; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[l][k];
                matrix[l][k] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        rotate(mat);
        System.out.println("Matrix after rotation =>");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
