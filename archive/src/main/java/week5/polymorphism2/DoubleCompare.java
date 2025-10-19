package week5.polymorphism2;

public final class DoubleCompare {

    public static final double DELTA = 1e-3;

    /**
     * Compare two double values for equality within a small delta.
     * @param a first double value
     * @param b second double value
     * @return true if the values are considered equal, false otherwise
     */
    public static boolean areEqual(double a, double b) {
        return Math.abs(a - b) < DELTA;
    }

}
