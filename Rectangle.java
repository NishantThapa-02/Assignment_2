 /**
 * A rectangle defined by its width and length.
 */
public class Rectangle implements Shape {
    private double width;
    private double length;

    /**
     * Creates a rectangle with the given dimensions.
     *
     * @param width  the width of the rectangle
     * @param length the length (height) of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle (width · length).
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Returns the class name of this shape.
     * @return "Rectangle"
     */
    @Override
    public String getClassName() {
        return "Rectangle";
    }

    /**
     * Returns a description of the rectangle for display in the GUI,
     * @return the string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle (" + width + "x" + length + ")";
    }
}
