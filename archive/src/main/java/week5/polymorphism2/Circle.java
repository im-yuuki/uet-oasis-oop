package week5.polymorphism2;

public class Circle extends Shape {

    protected Point center;
    protected double radius;

    /**
     * Default constructor.
     */
    public Circle() {
        super();
        this.center = new Point(0.0, 0.0);
        this.radius = 1.0;
    }

    /**
     * Constructor with radius.
     * @param radius radius
     */
    public Circle(double radius) {
        super();
        this.center = new Point(0.0, 0.0);
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
        this.center = new Point(0.0, 0.0);
        this.radius = radius;
    }

    /**
     * Constructor with center point, radius, color and filled.
     * @param center center point
     * @param radius radius
     * @param color color
     * @param filled filled
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
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
        return String.format(
                "Circle[center=%s,radius=%.1f,color=%s,filled=%b]",
                center, radius, color, filled
        );
    }

    /**
     * Check equality of two circles.
     * @param obj other object
     * @return true if equal, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return DoubleCompare.areEqual(other.radius, radius) && center.equals(other.center);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
