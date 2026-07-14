class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] grids = new HashSet[9];

        for (int i = 0; i < rows.length; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            grids[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows[i].contains(board[i][j])) {
                    return false;
                }
                rows[i].add(board[i][j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (cols[i].contains(board[j][i])) {
                    return false;
                }
                cols[i].add(board[j][i]);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int gridIndex = (i / 3) * 3 + (j / 3);
                if (board[i][j] == '.') {
                    continue;
                }
                if (grids[gridIndex].contains(board[i][j])) {
                    return false;
                }
                grids[gridIndex].add(board[i][j]);
            }
        }

        return true;

    }
}
