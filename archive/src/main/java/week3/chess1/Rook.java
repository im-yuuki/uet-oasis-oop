package week3.chess1;

public class Rook extends Piece {

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int toX, int toY) {
        if (!board.validate(toX, toY)) {
            return false;
        }
        if (getCoordinatesX() != toX && getCoordinatesY() != toY) {
            return false;
        }
        if (getCoordinatesX() == toX) {
            int direction = (toY - getCoordinatesY()) > 0 ? 1 : -1;
            for (int y = getCoordinatesY() + direction; y != toY; y += direction) {
                Piece piece = board.getAt(getCoordinatesX(), y);
                if (piece != null) {
                    return false;
                }
            }
        }
        if (getCoordinatesY() == toY) {
            int direction = (toX - getCoordinatesX()) > 0 ? 1 : -1;
            for (int x = getCoordinatesX() + direction; x != toX; x += direction) {
                Piece piece = board.getAt(x, getCoordinatesY());
                if (piece != null) {
                    return false;
                }
            }
        }
        Piece destinationPiece = board.getAt(toX, toY);
        return destinationPiece == null
                || !destinationPiece.getColor().equals(this.getColor());
    }

}
