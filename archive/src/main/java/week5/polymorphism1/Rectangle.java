package week5.polymorphism1;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    /**
     * default constructor.
     */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor with width and length.
     * @param width width
     * @param length length
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor with width, length, color and filled.
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Calculate area.
     * @return area
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Calculate perimeter.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }


    /**
     * Return string representation of the rectangle.
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format(
                "Rectangle[width=%.1f,length=%.1f,color=%s,filled=%b]",
                width, length, color, filled
        );
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
