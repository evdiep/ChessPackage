public class ChessGame {
    ChessBoard board;

    public ChessGame() {
        initChessGame();
    }

    private void initChessGame() {
        board = new ChessBoard();
        board.initBoard();
    }

    private void beginGame() {
        ConsolePrinter.printBoard(board);
    }
}
