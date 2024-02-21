/**
 * A demonstration class for running examples with Circle objects.
 */
public class CircleRun {

    /**
     * Creates an instance of CircleRun.
     * This default constructor is included for completeness, though this class is
     * primarily used for its static main method.
     */
    public CircleRun() {
        super(); // Call to superclass constructor is implicit, included for clarity.
    }

    /**
     * The main method to run examples.
     * Parses command line arguments to create Circle1 and Circle2 objects,
     * and checks if they intersect, printing the result to the console.
     *
     * @param args Command line arguments expected in the form of x1 y1 r1 x2 y2 r2,
     *             where x and y represent the coordinates of the circle's center,
     *             and r represents the radius of the circle.
     */
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

        } catch (NumberFormatException e) {
            System.out.println("Bad arguments! Ensure all coordinates and radii are valid numbers.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
