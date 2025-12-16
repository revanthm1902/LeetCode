class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 9 rows, 9 columns, 9 boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];

                if (ch == '.') continue; // skip empty

                int num = ch - '1';   // convert '1'-'9' → 0-8
                int boxIndex = (r / 3) * 3 + (c / 3);

                // check row
                if (rows[r][num]) return false;
                rows[r][num] = true;

                // check column
                if (cols[c][num]) return false;
                cols[c][num] = true;

                // check box
                if (boxes[boxIndex][num]) return false;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}