package gameLife;

public class Board {

    private boolean[][] board;

    public Board(int x, int y) {

        board = new boolean[x][y];
    }

    public void generateBoard() {
        board[1][1] = true;
        board[1][2] = true;
        board[1][3] = true;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] ? '*' : '.');
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration();
    }

    private void nextGeneration() {
        boolean[][] temp = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    temp[i][j] = countNeighbours(i, j) == 2 || countNeighbours(i, j) == 3;
                } else {
                    temp[i][j] = countNeighbours(i, j) == 3;
                }
            }
        }
        board = temp;
    }

    private int countNeighbours(int x, int y) {
        int neighbours = 0;
        for (int i = Math.max(x - 1, 0); i <= Math.min(x + 1, board.length - 1); i++) {
            for (int j = Math.max(y - 1, 0); j <= Math.min(y + 1, board[0].length - 1); j++) {
                if (x == i && y == j) continue;
                if (board[i][j]) neighbours++;
            }
        }
        return neighbours;
    }


}
