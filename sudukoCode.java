public class sudukoCode {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check if the number is safe to place in the specified row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Check if the number is safe to place in the 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        // Base case: If all rows are filled, the Sudoku puzzle is solved
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            // If the current cell is not empty, move to the next cell
            return helper(board, nrow, ncol);
        } else {
            // Try placing numbers from 1 to 9 in the empty cell
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    // Place the number in the cell and move to the next cell
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        // If the number doesn't lead to a solution, backtrack
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    public static void solveProblem(char[][] board) {
        // Start solving the Sudoku puzzle
        sudukoCode solver = new sudukoCode();
        solver.helper(board, 0, 0);
    }
}
