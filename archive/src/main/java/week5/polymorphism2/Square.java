package week5.polymorphism2;

public class Square extends Rectangle {

    /**
     * Constructor for Square class.
     * @param side the length of the side of the square
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor for Square class with side, color and filled.
     * @param side the length of the side of the square
     * @param color the color of the square
     * @param filled whether the square is filled
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor for Square class with top left point, side, color and filled.
     * @param topLeft the top left point of the square
     * @param side the length of the side of the square
     * @param color the color of the square
     * @param filled whether the square is filled
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Return string representation of the square.
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format(
                "Square[topLeft=%s,side=%.1f,color=%s,filled=%b]",
                topLeft, getSide(), color, filled
        );
    }

    /**
     * Check if two squares are equal.
     * @param obj the reference object
     * @return true/false
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Square square = (Square) obj;
        return DoubleCompare.areEqual(getSide(), square.getSide())
                && topLeft.equals(square.topLeft);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

}
