package gameLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameLifeMain {
    public static void main(String[] args) {
        Board board = new Board(15, 35);
        board.generateBoard(50);
        board.printBoard();

        List<boolean[][]> boards = new ArrayList<>(100);
        int counter = 0;
        while (true) {
            if (counter == 100) {
                counter = 0;
            }
            boolean[][] newGenerated = board.nextGeneration();
            board.printBoard(newGenerated);
            if (isAllDead( newGenerated)) {
                System.out.println("all dead!");
                return;
            }
            if (isRepeated(boards, newGenerated)) {
                System.out.println("repeated!");
                return;
            }
            boards.add(counter, newGenerated);
            counter++;
        }
    }

    private static boolean isAllDead(boolean[][] newGenerated) {
        for (boolean[] booleans : newGenerated) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isRepeated(List<boolean[][]> boards, boolean[][] newGenerated) {
        for (boolean[][] board : boards) {
            if (Arrays.deepEquals(board, newGenerated)) {
                return true;
            }
        }
        return false;
    }
}
