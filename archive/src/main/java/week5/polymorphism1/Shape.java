package week5.polymorphism1;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    /**
     * Default constructor.
     */
    public Shape() {
        this.color = null;
        this.filled = false;
    }

    /**
     * Constructor with color and filled.
     * @param color color
     * @param filled filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Get area of shape.
     * @return area
     */
    public abstract double getArea();

    /**
     * Get perimeter of shape.
     * @return perimeter
     */
    public abstract double getPerimeter();

    /**
     * Get string representation of shape.
     * @return string representation
     */
    public String toString() {
        return String.format("Shape[color=%s,filled=%b]", color, filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
