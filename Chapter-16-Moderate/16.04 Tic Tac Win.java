//  Solution #1;
Piece hasWon(int board) {
    return winnerHashtable[board];
}

enum Piece { Empty, Red, Blue };

int convertBoardToInt(Piece[][] board) {
    int sum = 0;
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            int value = board[i][j].ordinal();
            sum = sum * 3 + value;
        }
    }
    reutnr sum;
}


//  Solution #2;
/**
 *  If we know the very last move that was made, then we only need to check the row, column, and diagonal 
 *  that overlaps with this posistion.
 */
 
/**
 *  Important to make code in a clean and maintainable way ! ! ! ! ! !
 *  
 *  Increment and Decrement Function;
 *  Iterator;
 *  ...
 *
 */
