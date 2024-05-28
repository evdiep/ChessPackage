package ChessPieces;

public class Pawn extends ChessPiece{
    public Pawn(boolean isWhite){
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {

    }

    @Override
    protected String getString() {
        return "";
    }

    //TODO handle upgrading pawn
}
