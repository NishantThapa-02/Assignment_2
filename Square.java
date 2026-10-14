/**
 * A square defined by the length of its side.
 */
public class Square implements Shape {
    private double side;

    /**
     * Creates a square with the given side length.
     * @param side the length of one side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square (side²).
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns the class name of this shape.
     * @return "Square"
     */
    @Override
    public String getClassName() {
        return "Square";
    }

    /**
     * Returns a description of the square for display in the GUI
     * @return the string representation of the square
     */
    @Override
    public String toString() {
        return "Square (s=" + side + ")";
    }
}
