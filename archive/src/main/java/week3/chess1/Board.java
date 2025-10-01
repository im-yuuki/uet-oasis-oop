package week3.chess1;

import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<>();

    public void addPiece(Piece piece) {
        for (Piece p : pieces) {
            if (p.checkPosition(piece)) {
                return;
            }
        }
        pieces.add(piece);
    }

    public boolean validate(int x, int y) {
        return x > 0 && x <= WIDTH && y > 0 && y <= HEIGHT;
    }

    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                return;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
