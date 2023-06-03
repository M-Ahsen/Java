public class MatrixTranspose {
    public static void main(String[] args) {
        // Given matrix
        int [][] matrix = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        System.out.println("Original Matrix:");
       printMatrix(matrix);

        // Transpose the matrix
        int [][] transpose = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose);
    }

   // Helper method to print a matrix
   public static void printMatrix(int [][] matrix) {
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
   }
}