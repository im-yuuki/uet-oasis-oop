package week5.test2interface;

public class Triangle implements GeometricObject {

    private final Point p1;
    private final Point p2;
    private final Point p3;

    /**
     * Constructor of Triangle class.
     * @param p1 point 1
     * @param p2 point 2
     * @param p3 point 3
     * @throws RuntimeException if two points are the same or the points are collinear
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if (p1.equals(p2) || p2.equals(p3) || p1.equals(p3)) {
            throw new RuntimeException("Two points are the same.");
        }
        double area = getArea();
        if (area == 0) {
            throw new RuntimeException("The points are collinear.");
        }
    }

    /**
     * Get area of the geometric object.
     *
     * @return area
     */
    @Override
    public double getArea() {
        return Math.abs((p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2.0
        );
    }

    /**
     * Get perimeter of the geometric object.
     *
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * Get information of the geometric object.
     *
     * @return information string
     */
    @Override
    public String getInfo() {
        return String.format(
                "Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(),
                p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY()
        );
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

}
