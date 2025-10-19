package week5.test2interface;

import java.util.List;

public class ShapeUtil {

    /**
     * Print information of geometric objects.
     * @param shapes list of geometric objects
     * @return information string
     */
    public static String printInfo(List<GeometricObject> shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                continue;
            }
            sb.append(shape.getInfo()).append("\n");
        }
        sb.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                continue;
            }
            sb.append(shape.getInfo()).append("\n");
        }
        return sb.toString();
    }

}
