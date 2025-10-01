package week3.chess1;

public abstract class Piece {

    private int coordinatesX = 0;
    private int coordinatesY = 0;
    private String color = "white";

    public Piece(int coordinatesX, int coordinatesY) {
        if (coordinatesX < 1 || coordinatesX > 8 || coordinatesY < 1 || coordinatesY > 8) {
            return;
        }
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (coordinatesX < 1 || coordinatesX > 8 || coordinatesY < 1 || coordinatesY > 8) {
            return;
        }
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
        if (!color.equals("white") && !color.equals("black")) {
            this.color = "white";
        }
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int toX, int toY);

    public boolean checkPosition(Piece anotherPiece) {
        return this.coordinatesX == anotherPiece.coordinatesX
                && this.coordinatesY == anotherPiece.coordinatesY;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        if (coordinatesX < 1 || coordinatesX > 8) {
            return;
        }
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        if (coordinatesY < 1 || coordinatesY > 8) {
            return;
        }
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("white") || color.equals("black")) {
            this.color = color;
        }
    }
}
