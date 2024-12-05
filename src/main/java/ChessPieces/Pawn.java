package ChessPieces;

public class Pawn extends ChessPiece{
    public Pawn(boolean isWhite){
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {

    }

    @Override
    public String getString() {
        return isWhite ? "wP" : "bP";
    }

    //TODO handle upgrading pawn
}
