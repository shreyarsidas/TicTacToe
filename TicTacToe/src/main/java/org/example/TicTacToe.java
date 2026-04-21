package org.example;
public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    /**
     * Entry point of the program
     */
    public static void main(String[] args) {

        // Test cases
        System.out.println("Move (1,1): " + isValidMove(1, 1));
        System.out.println("Move (3,0): " + isValidMove(3, 0));
        System.out.println("Move (0,0): " + isValidMove(0, 0));

        // Fill a cell and test again
        board[0][0] = 'X';
        System.out.println("Move (0,0) after placing X: " + isValidMove(0, 0));
    }

    /**
     * Validates whether the move is within bounds and the cell is empty
     */
    static boolean isValidMove(int row, int col) {

        // Check if row and column are within 0–2
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Check if the cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}