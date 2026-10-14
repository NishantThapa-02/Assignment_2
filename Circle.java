/**
 * A circle defined by its radius.
 */
public class Circle implements Shape {
    private double radius;

    /**
     * Creates a circle with the given radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle (π · r²).
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the class name of this shape.
     * @return "Circle"
     */
    @Override
    public String getClassName() {
        return "Circle";
    }

    /**
     * Returns a description of the circle for display in the GUI,
     * @return the string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    }
}
