package week5.polymorphism2;

public class Rectangle extends Shape {

    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * default constructor.
     */
    public Rectangle() {
        super();
        this.topLeft = new Point(0.0, 0.0);
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
        this.topLeft = new Point(0.0, 0.0);
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
        this.topLeft = new Point(0.0, 0.0);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor with top left point, width, length, color and filled.
     * @param topLeft top left point
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
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
                "Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
                topLeft, width, length, color, filled
        );
    }

    /**
     * Check if two rectangles are equal.
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
        Rectangle rectangle = (Rectangle) obj;
        return DoubleCompare.areEqual(rectangle.width, width)
                && DoubleCompare.areEqual(rectangle.length, length)
                && topLeft.equals(rectangle.topLeft);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
