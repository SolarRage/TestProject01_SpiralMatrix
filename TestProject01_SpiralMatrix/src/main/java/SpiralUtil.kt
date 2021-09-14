class SpiralUtil {

    /**
     * Function print matrix in spiral form
     * rowStartIndex - starting row index
     * rowEndIndex - ending row index
     * columnStartIndex - starting column index
     * columnEndIndex - ending column index
     */

    fun spiralPrint() {

        val matrix = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(5, 6, 7, 8)
        )

        var rowEndIndex = matrix.size
        if (rowEndIndex == 0) {
            return
        }
        var columnEndIndex: Int = matrix[1].size
        var iterator = 0
        var rowStartIndex = 0
        var columnStartIndex = 0

        while (rowStartIndex < rowEndIndex && columnStartIndex < columnEndIndex) {
            // Print the first row from the remaining rows
            iterator = columnStartIndex
            while (iterator < columnEndIndex) {
                print(matrix[rowStartIndex][iterator].toString() + " ")
                ++iterator
            }
            rowStartIndex++

            // Print the last column from the remaining
            // columns
            iterator = rowStartIndex
            while (iterator < rowEndIndex) {
                print(matrix[iterator][columnEndIndex - 1].toString() + " ")
                ++iterator
            }
            columnEndIndex--

            // Print the last row from the remaining rows */
            if (rowStartIndex < rowEndIndex) {
                iterator = columnEndIndex - 1
                while (iterator >= columnStartIndex) {
                    print(matrix[rowEndIndex - 1][iterator].toString() + " ")
                    --iterator
                }
                rowEndIndex--
            }

            // Print the first column from the remaining
            // columns */
            if (columnStartIndex < columnEndIndex) {
                iterator = rowEndIndex - 1
                while (iterator >= rowStartIndex) {
                    print(matrix[iterator][columnStartIndex].toString() + " ")
                    --iterator
                }
                columnStartIndex++
            }
        }
    }
}