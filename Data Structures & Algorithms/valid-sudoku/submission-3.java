class Solution {
    public boolean isValidSudoku(char[][] board) {
        // each row, no duplicates
        for (int i = 0 ; i < 9; i++) {
            Set<Character> seen = new HashSet<Character>();
            for (int j = 0 ; j < 9; j++) {
                if (board[j][i] != ('.')) {
                    if (seen.contains(board[j][i])) {
                        return false;
                    } else {
                        seen.add(board[j][i]);
                    }
                }
            }
        }
        

        // each col, no duplicates
        for (int i = 0 ; i < 9; i++) {
            Set<Character> seen = new HashSet<Character>();
            for (int j = 0 ; j < 9; j++) {
                if (board[i][j] != ('.')) {
                    if (seen.contains(board[i][j])) {
                        return false;
                    } else {
                        seen.add(board[i][j]);
                    }
                }
            }
        }

        //each subbox, no duplicates
        for (int i = 0 ; i < 9 ; i++) {
            Set<Character> seen = new HashSet<Character>();
            for (int j = 0; j < 3; j ++) {
                for (int k =0 ;k< 3; k ++) {
                    int col = k + (i % 3)*3;
                    int row = j + (i/3)*3;
                    if (board[row][col] != ('.')) {
                    if (seen.contains(board[row][col])) {
                        return false;
                    } else {
                        seen.add(board[row][col]);
                    }
                }
                }
            }
}        return true;
    }
}
