/**
 * Circle2 extends the abstract Circle class, providing an implementation
 * that determines whether two circles intersect based on their centers and radii.
 */
public class Circle2 extends Circle {

    /**
     * Constructs a Circle2 instance with a specified center and radius.
     * 
     * @param x The x-coordinate of the center of the circle.
     * @param y The y-coordinate of the center of the circle.
     * @param radius The radius of the circle. Must be a non-negative value.
     */
    public Circle2(double x, double y, double radius) {
        super(x, y, radius);
    }

    /**
     * Determines if this circle intersects with another circle.
     * Two circles intersect if the distance between their centers is less than or equal to
     * the sum of their radii.
     * 
     * @param other The other circle to check for intersection with.
     * @return {@code true} if this circle intersects with the other circle; {@code false} otherwise.
     */
    @Override
    public boolean intersects(Circle other) {
        double distance = Math.sqrt(Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2));
        return distance <= (this.radius + other.radius);
    }
}
