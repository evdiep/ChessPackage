package ChessPieces;

public abstract class ChessPiece {
    protected boolean isWhite;
    public ChessPiece(){
    }
    protected abstract void getMovement();
        //TODO
    protected abstract String getString();
}
