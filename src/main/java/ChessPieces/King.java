package ChessPieces;

public class King extends ChessPiece {
    public King(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {

    }

    @Override
    public String getString() {
        return isWhite ? "wK" : "bK";
    }
}
