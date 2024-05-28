import ChessPieces.ChessPiece;

public class ChessSpace {
    //TODO move to new class
    private ChessPiece occupant = null;
    private final Position position;
    public ChessSpace(Position position, ChessPiece piece) {
        this.position = position;
        this.occupant = piece;
    }
    private ChessPiece getOccupant(){
        //if empty return null;
        return occupant;
    }
    private boolean isEmpty() {
        return occupant == null;
    }

    private boolean isWhiteSpace() {//TODO move to new class
        return (position.equals(Positions.a2) ||
                position.equals(Positions.a4) ||
                position.equals(Positions.a6) ||
                position.equals(Positions.a8) ||
                position.equals(Positions.b1) ||
                position.equals(Positions.b3) ||
                position.equals(Positions.b5) ||
                position.equals(Positions.b7) ||
                position.equals(Positions.c2) ||
                position.equals(Positions.c4) ||
                position.equals(Positions.c6) ||
                position.equals(Positions.c8) ||
                position.equals(Positions.d1) ||
                position.equals(Positions.d3) ||
                position.equals(Positions.d5) ||
                position.equals(Positions.d7) ||
                position.equals(Positions.e2) ||
                position.equals(Positions.e4) ||
                position.equals(Positions.e6) ||
                position.equals(Positions.e8) ||
                position.equals(Positions.f1) ||
                position.equals(Positions.f3) ||
                position.equals(Positions.f5) ||
                position.equals(Positions.f7) ||
                position.equals(Positions.g2) ||
                position.equals(Positions.g4) ||
                position.equals(Positions.g6) ||
                position.equals(Positions.g8) ||
                position.equals(Positions.h1) ||
                position.equals(Positions.h3) ||
                position.equals(Positions.h5) ||
                position.equals(Positions.h7));
    }
}
