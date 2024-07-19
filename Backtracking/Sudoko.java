package Backtracking;

public class Sudoko {
    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is not in the current row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is not in the current 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solveSudoku(int[][] board, int row, int col) {
        // Base case: If we have reached the 9th row, the board is solved
        if (row == 9) {
            return true;
        }

        // Move to the next row if we have reached the end of the current row
        int newRow = row;
        int newCol = col + 1;
        if (col == 8) {
            newRow = row + 1;
            newCol = 0;
        }

        // If the current cell is not empty, move to the next cell
        if (board[row][col] != 0) {
            return solveSudoku(board, newRow, newCol);
        }

        // Try placing digits from 1 to 9 in the current cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solveSudoku(board, newRow, newCol)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }

        return false;
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 0}
        };

        if (solveSudoku(board, 0, 0)) {
            System.out.println("Solution exists:");
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
