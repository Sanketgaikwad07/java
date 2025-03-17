public class NQueensII {
    public int totalNQueens(int n) {
        return solveNQueens(n, 0, 0, 0, 0);
    }

    private int solveNQueens(int n, int row, int columns, int diag1, int diag2) {
        if (row == n) return 1;
        int count = 0;
        int availablePositions = ((1 << n) - 1) & ~(columns | diag1 | diag2);
        while (availablePositions != 0) {
            int position = availablePositions & -availablePositions;
            availablePositions -= position;
            count += solveNQueens(n, row + 1, columns | position, (diag1 | position) << 1, (diag2 | position) >> 1);
        }
        return count;
    }
}
