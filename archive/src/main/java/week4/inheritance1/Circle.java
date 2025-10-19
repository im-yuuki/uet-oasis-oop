package week4.inheritance1;

public class Circle {

    private double radius;
    private String color;

    protected static final double PI = 3.14;

    /**
     * Construct a Circle with default radius 1.0 and color "red".
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /**
     * Construct a Circle with the given radius and default color "red".
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Construct a Circle with the given radius and color.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Return a self-descriptive string in the form of.
     * @return "Circle[radius=?,color=?]"
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    /**
     * Return the area of this Circle.
     * @return area of this Circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
