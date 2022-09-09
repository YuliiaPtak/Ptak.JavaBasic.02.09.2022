package gameLife;

public class Board {

    private boolean[][] board;

    public Board(int x, int y) {
        board = new boolean[x][y];
    }

    public void generateBoard(int aliveCells) {
        for (int i = 0; i < aliveCells; ) {
            int x = (int) (Math.random() * board.length);
            int y = (int) (Math.random() * board[0].length);
            boolean alive = board[x][y];
            if (alive) {
                continue;
            }
            board[x][y] = true;
            i++;
        }
    }

    public void printBoard() {
        printBoard(board);
    }

    public void printBoard(boolean[][] board) {
        for (boolean[] booleans : board) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean ? '*' : '.');
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean[][] nextGeneration() {
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
        return board;
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
