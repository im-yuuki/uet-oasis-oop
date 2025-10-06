package week4.kethua1;

public class Cylinder extends Circle {
    private double height;

    /**
     * Default constructor.
     */
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    /**
     * Constructor with specified height.
     * @param height the height of the cylinder
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * Constructor with specified height and radius.
     * @param height the height of the cylinder
     * @param radius the radius of the base circle
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor with specified height, radius, and color.
     * @param height the height of the cylinder
     * @param radius the radius of the base circle
     * @param color the color of the cylinder
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Calculate the volume of the cylinder.
     * @return the volume of the cylinder
     */
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    /**
     * Return a string representation of the cylinder.
     * @return a string representation of the cylinder
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * Calculate the surface area of the cylinder.
     * @return the surface area of the cylinder
     */
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
