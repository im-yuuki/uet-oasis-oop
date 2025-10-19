package week5.polymorphism1;

public class Circle extends Shape {

    protected double radius;

    /**
     * Default constructor.
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * Constructor with radius.
     * @param radius radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor with radius, color and filled.
     * @param radius radius
     * @param color color
     * @param filled filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Get area of circle.
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Get perimeter of circle.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Get string representation of circle.
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format("Circle[radius=%.1f,color=%s,filled=%b]", radius, color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
