/**
 * Common interface for all shapes managed by the Shape List App
 */
public interface Shape{
    /**
    * Calculates the area of this shape.
    *
    * @return the area of the shape
    */
    double getArea();
    /**
    * Returns the name of the concrete shape class, e.g. "Circle" or "Rectangle".
    *
    * @return the class name of the shape
    */
    String getClassName();
}