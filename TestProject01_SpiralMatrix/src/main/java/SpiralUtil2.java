public class SpiralUtil2 {

    /**
     * Function print matrix in spiral form
     * rowStartIndex - starting row index
     * rowEndIndex - ending row index
     * columnStartIndex - starting column index
     * columnEndIndex - ending column index
     */

    static void spiralPrint(int[][] matrix) {

        int rowEndIndex = matrix.length;
        if (rowEndIndex == 0) {
            return;
        }
        int columnEndIndex = matrix[1].length;
        int iterator;
        int rowStartIndex = 0;
        int columnStartIndex = 0;


        while (rowStartIndex < rowEndIndex && columnStartIndex < columnEndIndex) {
            // Print the first row from the remaining rows
            for (iterator = columnStartIndex; iterator < columnEndIndex; ++iterator) {
                System.out.print(matrix[rowStartIndex][iterator] + " ");
            }
            rowStartIndex++;

            // Print the last column from the remaining
            // columns
            for (iterator = rowStartIndex; iterator < rowEndIndex; ++iterator) {
                System.out.print(matrix[iterator][columnEndIndex - 1] + " ");
            }
            columnEndIndex--;

            // Print the last row from the remaining rows */
            if (rowStartIndex < rowEndIndex) {
                for (iterator = columnEndIndex - 1; iterator >= columnStartIndex; --iterator) {
                    System.out.print(matrix[rowEndIndex - 1][iterator] + " ");
                }
                rowEndIndex--;
            }

            // Print the first column from the remaining
            // columns */
            if (columnStartIndex < columnEndIndex) {
                for (iterator = rowEndIndex - 1; iterator >= rowStartIndex; --iterator) {
                    System.out.print(matrix[iterator][columnStartIndex] + " ");
                }
                columnStartIndex++;
            }
        }
    }
}
