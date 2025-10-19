package week5.polymorphism2;

import java.util.LinkedList;
import java.util.List;

public class Layer {

    private final List<Shape> shapes = new LinkedList<>();

    /**
     * Add shape to the layer.
     *
     * @param shape shape to add
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Get information of all shapes in the layer.
     *
     * @return information string
     */
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Remove all circles from the layer.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Remove duplicate shapes from the layer.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape shapeI = shapes.get(i);
            for (int j = i + 1; j < shapes.size(); j++) {
                Shape shapeJ = shapes.get(j);
                if (shapeI.toString().equals(shapeJ.toString())) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }

}
