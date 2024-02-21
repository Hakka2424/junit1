import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Circle1 to verify its behavior through unit testing. This class
 * focuses on testing the functionality provided by the Circle1 class, including
 * moving the circle, scaling, and checking for intersections with other circles.
 */
public class Circle1Test {

    /**
     * Default constructor for Circle1Test.
     */
    public Circle1Test() {
        super(); // Explicitly calling the superclass constructor is optional here.
    }
    
    /**
     * The Circle1 instance to be tested.
     */
    private Circle1 circle1;

    /**
     * Sets up the test environment before each test method. Initializes a Circle1
     * instance with a predefined set of parameters.
     */
    @BeforeEach
    public void setup() {
        System.out.println("\nTest starting...");
        circle1 = new Circle1(1, 2, 3); // Initialize with x=1, y=2, radius=3
    }

    /**
     * Cleans up the test environment after each test method. This can be used to
     * release resources or perform other teardown operations.
     */
    @AfterEach
    public void teardown() {
        System.out.println("Test finished.");
    }

    /**
     * Tests the functionality of moving a circle positively along both the x and y axes.
     */
    @Test
    public void simpleMove() {
        CirclePoint p = circle1.moveBy(1, 1);
        assertEquals(2, p.x, "X coordinate after move should be 2");
        assertEquals(3, p.y, "Y coordinate after move should be 3");
    }

    /**
     * Tests the functionality of moving a circle negatively along both the x and y axes.
     */
    @Test
    public void simpleMoveNeg() {
        CirclePoint p = circle1.moveBy(-1, -1);
        assertEquals(0, p.x, "X coordinate after negative move should be 0");
        assertEquals(1, p.y, "Y coordinate after negative move should be 1");
    }

    /**
     * Tests scaling the circle positively by doubling its radius.
     */
    @Test
    public void scalePositive() {
        double newRadius = circle1.scale(2.0); // Should double the radius
        assertEquals(6, newRadius, "Radius after scaling positively should be 6");
    }

    /**
     * Tests scaling the circle with a negative factor, which should not change the radius.
     */
    @Test
    public void scaleNegative() {
        double originalRadius = circle1.radius;
        double newRadius = circle1.scale(-1.0); // Should not change the radius
        assertEquals(originalRadius, newRadius, "Radius after scaling negatively should remain unchanged");
    }

    /**
     * Tests the intersection of two circles that do intersect.
     */
    @Test
    public void intersectingCircles() {
        Circle1 otherCircle = new Circle1(3, 3, 2); // This circle should intersect with circle1
        assertTrue(circle1.intersects(otherCircle), "Circles should intersect");
    }

    /**
     * Tests the intersection of two circles that do not intersect.
     */
    @Test
    public void nonIntersectingCircles() {
        Circle1 otherCircle = new Circle1(10, 10, 1); // This circle should not intersect with circle1
        assertFalse(circle1.intersects(otherCircle), "Circles should not intersect");
    }
}
