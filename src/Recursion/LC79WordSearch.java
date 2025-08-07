package Recursion;

public class LC79WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (checkWord(board, word, row, col, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkWord(char[][] arr, String word, int r, int c, int i, boolean[][] visited) {
        if (i == word.length()) {
            return true;
        }
        if (r < 0 || c < 0 || r > arr.length - 1 || c >= arr[0].length || visited[r][c]||word.charAt(i)!=arr[r][c]) {
            return false;
        }
        visited[r][c] = true;
        boolean found = checkWord(arr, word, r + 1, c, i + 1, visited) || checkWord(arr, word, r - 1, c, i + 1, visited) || checkWord(arr, word, r, c + 1, i + 1, visited) || checkWord(arr, word, r, c - 1, i + 1, visited);
        visited[r][c] = false;
        return found;
    }
}

