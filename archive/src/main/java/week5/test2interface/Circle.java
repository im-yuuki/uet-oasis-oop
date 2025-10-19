package week5.test2interface;

public class Circle implements GeometricObject {

    public static final double PI = 3.14d;

    private Point center;
    private double radius;

    /**
     * Constructor with center and radius.
     *
     * @param center center
     * @param radius radius
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get area of the geometric object.
     *
     * @return area
     */
    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Get perimeter of the geometric object.
     *
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    /**
     * Get information of the geometric object.
     *
     * @return information string
     */
    @Override
    public String getInfo() {
        return String.format(
                "Circle[(%.2f,%.2f),r=%.2f]",
                center.getPointX(), center.getPointY(), radius
        );
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
