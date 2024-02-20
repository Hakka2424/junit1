/**
 * Implements a base abstract class for a circle. Everything except 
 * an intersects() method is implemented here. Subclass must implement
 * the intersects() method.
 */
public abstract class Circle {
   protected CirclePoint center;
   protected double radius;

   /**
    * Create new circle
    * @param x is the x-coordinate of the center
    * @param y is the y-coordinate of the center
    * @param radius is the radius (assume non-negative)
    */
   public Circle(double x, double y, double radius) {
       this.center = new CirclePoint(x, y);
       this.radius = radius;
   }

   /**
    * Change size of circle
    * @param factor is the scaling factor (0.8 makes it 80% as big, 2.0 doubles its size)
    *        (if negative, return without scaling)
    * @return the new radius
    */
   public double scale(double factor) {
       if (factor < 0) return this.radius; // Return without changing if factor is negative
       this.radius *= factor; // Scale the radius by the factor
       return this.radius;
   }

   /**
    * Change position of circle relative to current position
    * @param xOffset is amount to change x coordinate
    * @param yOffset is amount to change y coordinate
    * @return the new center coordinate
    */
   public CirclePoint moveBy(double xOffset, double yOffset) {
       this.center.x += xOffset;
       this.center.y += yOffset;
       return this.center;
   }

   /**
    * Test if this circle intersects another circle.
    * @param other is the other circle
    * @return True if the circles' outer edges intersect
    *         at all, False otherwise
    */
   public abstract boolean intersects(Circle other);
}

/**
* Simple class to represent a point in 2D space.
*/
class CirclePoint {
   double x, y;

   public CirclePoint(double x, double y) {
       this.x = x;
       this.y = y;
   }
}
