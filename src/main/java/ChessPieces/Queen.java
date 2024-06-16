package ChessPieces;

public class Queen extends ChessPiece{
    public Queen(boolean isWhite){
        this.isWhite = isWhite;
    }
    @Override
    protected void getMovement() {

    }

    @Override
    public String getString() {
        return isWhite ? "wQ" : "bQ";
    }
}
