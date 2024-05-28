package ChessPieces;


public class Bishop extends ChessPiece {

    public Bishop(boolean isWhite){
        this.isWhite = isWhite;
    }

    @Override
    protected void getMovement() {

    }

    @Override
    protected String getString() {
        return ""; //TODO check access issues for GuiConstants
//        return this.isWhite ? GuiConstants.WHITE_BISHOP : GuiConstants.BLACK_BISHOP;
    }
}
