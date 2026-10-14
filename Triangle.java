/**
* A triangle defined by its base and height.
 */
public class Triangle implements Shape {
    private double base;
    private double height;

    /**
     * Creates a triangle with the given base and height.
     * @param base   the length of the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle (½ · base · height).
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the class name of this shape.
     * @return "Triangle"
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns a description of the triangle for display in the GUI,
     * @return the string representation of the triangle
     */
    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    }
}
