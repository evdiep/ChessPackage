import ChessPieces.*;

import java.util.HashMap;

public class ChessBoard {
    private HashMap<String, ChessSpace> chessBoardHash;
    public ChessBoard() {
        initBoard();
    }
    public void initBoard() {
        initWhitePieces();
        initEmptySpaces();
        initBlackPieces();
    }

    private void initWhitePieces() {
        chessBoardHash = new HashMap<String, ChessSpace>();
        chessBoardHash.put(Positions.a1, new ChessSpace(new Rook(true)));
        chessBoardHash.put(Positions.b1, new ChessSpace(new Knight(true)));
        chessBoardHash.put(Positions.c1, new ChessSpace(new Bishop(true)));
        chessBoardHash.put(Positions.d1, new ChessSpace(new Queen(true)));
        chessBoardHash.put(Positions.e1, new ChessSpace(new King(true)));
        chessBoardHash.put(Positions.f1, new ChessSpace(new Bishop(true)));
        chessBoardHash.put(Positions.g1, new ChessSpace(new Knight(true)));
        chessBoardHash.put(Positions.h1, new ChessSpace(new Rook(true)));

        initWhitePawns();
    }
    private void initWhitePawns() {
        chessBoardHash.put(Positions.a2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.b2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.c2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.d2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.e2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.f2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.g2, new ChessSpace(new Pawn(true)));
        chessBoardHash.put(Positions.h2, new ChessSpace(new Pawn(true)));
    }
    private void initBlackPieces() {
        chessBoardHash.put(Positions.a8, new ChessSpace(new Rook(false)));
        chessBoardHash.put(Positions.b8, new ChessSpace(new Knight(false)));
        chessBoardHash.put(Positions.c8, new ChessSpace(new Bishop(false)));
        chessBoardHash.put(Positions.d8, new ChessSpace(new Queen(false)));
        chessBoardHash.put(Positions.e8, new ChessSpace(new King(false)));
        chessBoardHash.put(Positions.f8, new ChessSpace(new Bishop(false)));
        chessBoardHash.put(Positions.g8, new ChessSpace(new Knight(false)));
        chessBoardHash.put(Positions.h8, new ChessSpace(new Rook(false)));

        initBlackPawns();
    }

    private void initBlackPawns() {
        chessBoardHash.put(Positions.a7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.b7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.c7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.d7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.e7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.f7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.g7, new ChessSpace(new Pawn(false)));
        chessBoardHash.put(Positions.h7, new ChessSpace(new Pawn(false)));
    }
    private void initEmptySpaces() {
        chessBoardHash.put(Positions.a6, new ChessSpace());
        chessBoardHash.put(Positions.b6, new ChessSpace());
        chessBoardHash.put(Positions.c6, new ChessSpace());
        chessBoardHash.put(Positions.d6, new ChessSpace());
        chessBoardHash.put(Positions.e6, new ChessSpace());
        chessBoardHash.put(Positions.f6, new ChessSpace());
        chessBoardHash.put(Positions.g6, new ChessSpace());
        chessBoardHash.put(Positions.h6, new ChessSpace());

        chessBoardHash.put(Positions.a5, new ChessSpace());
        chessBoardHash.put(Positions.b5, new ChessSpace());
        chessBoardHash.put(Positions.c5, new ChessSpace());
        chessBoardHash.put(Positions.d5, new ChessSpace());
        chessBoardHash.put(Positions.e5, new ChessSpace());
        chessBoardHash.put(Positions.f5, new ChessSpace());
        chessBoardHash.put(Positions.g5, new ChessSpace());
        chessBoardHash.put(Positions.h5, new ChessSpace());

        chessBoardHash.put(Positions.a4, new ChessSpace());
        chessBoardHash.put(Positions.b4, new ChessSpace());
        chessBoardHash.put(Positions.c4, new ChessSpace());
        chessBoardHash.put(Positions.d4, new ChessSpace());
        chessBoardHash.put(Positions.e4, new ChessSpace());
        chessBoardHash.put(Positions.f4, new ChessSpace());
        chessBoardHash.put(Positions.g4, new ChessSpace());
        chessBoardHash.put(Positions.h4, new ChessSpace());

        chessBoardHash.put(Positions.a3, new ChessSpace());
        chessBoardHash.put(Positions.b3, new ChessSpace());
        chessBoardHash.put(Positions.c3, new ChessSpace());
        chessBoardHash.put(Positions.d3, new ChessSpace());
        chessBoardHash.put(Positions.e3, new ChessSpace());
        chessBoardHash.put(Positions.f3, new ChessSpace());
        chessBoardHash.put(Positions.g3, new ChessSpace());
        chessBoardHash.put(Positions.h3, new ChessSpace());

    }

    private void movePiece(Position start, Position end){
        //TODO
    }

    public String toString() { //TODO test
        String line = "    a  b  c  d  e  f  g  h \n";
        line += "   -----------------------\n";
        line += "8  " + chessBoardHash.get(Positions.a8).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.b8).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.c8).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.d8).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.e8).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.f8).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.g8).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.h8).printOrDefault(GuiConstants.BLACK_SPACE) + "\n";
        line += "7  " + chessBoardHash.get(Positions.a7).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.b7).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.c7).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.d7).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.e7).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.f7).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.g7).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.h7).printOrDefault(GuiConstants.WHITE_SPACE) + "\n";
        line += "6  " + chessBoardHash.get(Positions.a6).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.b6).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.c6).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.d6).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.e6).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.f6).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.g6).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.h6).printOrDefault(GuiConstants.BLACK_SPACE) + "\n";
        line += "5  " + chessBoardHash.get(Positions.a5).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.b5).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.c5).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.d5).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.e5).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.f5).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.g5).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.h5).printOrDefault(GuiConstants.WHITE_SPACE) + "\n";
        line += "4  " + chessBoardHash.get(Positions.a4).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.b4).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.c4).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.d4).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.e4).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.f4).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.g4).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.h4).printOrDefault(GuiConstants.BLACK_SPACE) + "\n";
        line += "3  " + chessBoardHash.get(Positions.a3).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.b3).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.c3).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.d3).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.e3).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.f3).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.g3).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.h3).printOrDefault(GuiConstants.WHITE_SPACE) + "\n";
        line += "2  " + chessBoardHash.get(Positions.a2).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.b2).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.c2).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.d2).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.e2).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.f2).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.g2).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.h2).printOrDefault(GuiConstants.BLACK_SPACE) + "\n";
        line += "1  " + chessBoardHash.get(Positions.a1).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.b1).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.c1).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.d1).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.e1).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.f1).printOrDefault(GuiConstants.WHITE_SPACE) + " " + chessBoardHash.get(Positions.g1).printOrDefault(GuiConstants.BLACK_SPACE) + " " + chessBoardHash.get(Positions.h1).printOrDefault(GuiConstants.WHITE_SPACE) + "\n";
        return line;
    }
}
