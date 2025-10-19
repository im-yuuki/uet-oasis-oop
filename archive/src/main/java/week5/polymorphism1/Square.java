package week5.polymorphism1;

public class Square extends Rectangle {

    /**
     * Constructor for Square class.
     * @param side the length of the side of the square
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor for Square class with color and filled.
     * @param side the length of the side of the square
     * @param color the color of the square
     * @param filled whether the square is filled
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Return string representation of the square.
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format("Square[side=%.1f,color=%s,filled=%b]", getSide(), color, filled);
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
