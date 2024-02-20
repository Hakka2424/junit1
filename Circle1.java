public class Circle1 extends Circle {

   public Circle1(double x, double y, double radius) {
       super(x, y, radius);
   }

   @Override
   public boolean intersects(Circle other) {
       // Calculate the distance between the centers of the two circles
       double distance = Math.sqrt(Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2));
       // Two circles intersect if the distance between their centers is less than or equal to the sum of their radii
       return distance <= (this.radius + other.radius);
   }
}
