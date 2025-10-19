package week5.test2interface;

public class Point {

    private double pointX;
    private double pointY;

    /**
     * Constructor with x and y.
     * @param x x
     * @param y y
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * Calculate distance to another point.
     * @param other other point
     * @return distance
     */
    public double distance(Point other) {
        double dx = this.pointX - other.pointX;
        double dy = this.pointY - other.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Check if two points are equal.
     * @param obj the reference object with which to compare.
     * @return true if this point is the same as the obj argument; false otherwise.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return point.pointX == pointX && point.pointY == pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

}
