/**
* Sample tester for Circle1 and Circle2
**/
public class CircleRun {

   /**
    * Accept command line args for two circles and then run their
    * intersect() methods.
    **/
   public static void main(String args[]) {
       if (args.length != 6) {
           System.out.println("Error: args must be x1 y1 r1 x2 y2 r2");
           return;
       }

       try {
           // Parse arguments for Circle1
           double x1 = Double.parseDouble(args[0]);
           double y1 = Double.parseDouble(args[1]);
           double r1 = Double.parseDouble(args[2]);
           Circle1 c1 = new Circle1(x1, y1, r1);

           // Parse arguments for Circle2
           double x2 = Double.parseDouble(args[3]);
           double y2 = Double.parseDouble(args[4]);
           double r2 = Double.parseDouble(args[5]);
           Circle2 c2 = new Circle2(x2, y2, r2);

           // Check and report intersection
           boolean intersects = c1.intersects(c2);
           System.out.println("Circle 1 intersects Circle 2: " + intersects);

           // Given the symmetry of circle intersection, the result should be the same from both perspectives
           // This line is redundant but kept for demonstration: 
           // System.out.println("Circle 2 intersects Circle 1: " + c2.intersects(c1));
       } catch (NumberFormatException e) {
           System.out.println("Bad arguments! Ensure all coordinates and radii are valid numbers.");
           e.printStackTrace();
       } catch (Exception e) {
           System.out.println("An unexpected error occurred: " + e.getMessage());
           e.printStackTrace();
       }
   }
}
