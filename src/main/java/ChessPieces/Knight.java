package ChessPieces;

public class Knight extends ChessPiece{

    public Knight(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {

    }

    @Override
    public String getString() {
        return isWhite ? "wN" : "bN";
    }
}
