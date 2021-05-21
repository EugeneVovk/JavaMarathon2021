package day17;

public class ChessBoard {
    //  шахматная доска
    //  будет хранить двумерный массив из шахматных фигур
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //  выводим эл-т и его строковое представлдение
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println();
        }
    }
}
