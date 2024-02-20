public class Circle2 extends Circle {

   public Circle2(double x, double y, double radius) {
       super(x, y, radius);
   }

   @Override
   public boolean intersects(Circle other) {
       double distance = Math.sqrt(Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2));
       return distance <= (this.radius + other.radius);
   }
}
