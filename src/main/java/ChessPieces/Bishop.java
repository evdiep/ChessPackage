package ChessPieces;

public class Bishop extends ChessPiece {

    public Bishop(boolean isWhite){
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {
        //test commit
    }

    @Override
    public String getString() {
        return isWhite ? "wB" : "bB";
        //TODO check access issues for GuiConstants
    }
}
