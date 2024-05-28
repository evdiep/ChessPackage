import ChessPieces.*;

import java.util.HashMap;

public class ChessBoard {
    private HashMap<Position, ChessSpace> chessBoardHash;
    public ChessBoard() {
        initBoard();
    }
    public void initBoard() {
        chessBoardHash = new HashMap<Position, ChessSpace>();
        initWhitePieces();
        initEmptyWhiteSpaces();
        initBlackPieces();
        initEmptyBlackSpaces();
    }

    private void initWhitePieces() {
        Position pos;

        pos = new Position("a1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Rook(true)));
        pos = new Position("b1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Knight(true)));
        pos = new Position("c1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Bishop(true)));
        pos = new Position("d1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Queen(true)));
        pos = new Position("e1");
        chessBoardHash.put(pos, new ChessSpace(pos, new King(true)));
        pos = new Position("f1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Bishop(true)));
        pos = new Position("g1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Knight(true)));
        pos = new Position("h1");
        chessBoardHash.put(pos, new ChessSpace(pos, new Rook(true)));

        pos = new Position("a2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("b2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("c2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("d2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("e2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("f2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
        pos = new Position("g2");
        chessBoardHash.put(pos, new ChessSpace(pos, new Pawn(true)));
    }

    private void initEmptyWhiteSpaces() {
        Position pos;
        pos = new Position("b3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("d3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("f3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("h3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("a4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("c4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("e4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("g4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("b5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("d5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("f5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("h5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("a6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("c6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("e6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("g6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));
    }

    private void initEmptyBlackSpaces() {
        Position pos;
        pos = new Position("a3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("c3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("e3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("g3");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("b4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("d4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("f4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("h4");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("a5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("c5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("e5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("g5");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("b6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("d6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("f6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

        pos = new Position("h6");
        chessBoardHash.put(pos, new ChessSpace(pos, null));

    }

    private void initBlackPieces(){
        Position pos;

        pos = new Position("a8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Rook(false)));
        pos = new Position("b8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Knight(false)));
        pos = new Position("c8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Bishop(false)));
        pos = new Position("d8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Queen(false)));
        pos = new Position("e8");
        chessBoardHash.put(pos, new ChessSpace(pos, new King(false)));
        pos = new Position("f8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Bishop(false)));
        pos = new Position("g8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Knight(false)));
        pos = new Position("h8");
        chessBoardHash.put(pos, new ChessSpace(pos, new Rook(false)));
    }
    private void movePiece(Position start, Position end){
        //TODO
    }
    public HashMap<Position, ChessSpace> getChessBoardHash() {
        return chessBoardHash;
    }
}
