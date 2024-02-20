import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Circle1Test {
    // Data you need for each test case
    private Circle1 circle1;

    // Stuff you want to do before each test case
    @BeforeEach
    public void setup() {
        System.out.println("\nTest starting...");
        circle1 = new Circle1(1, 2, 3); // Initialize with x=1, y=2, radius=3
    }

    // Stuff you want to do after each test case
    @AfterEach
    public void teardown() {
        System.out.println("Test finished.");
    }

    // Test a simple positive move
    @Test
    public void simpleMove() {
        CirclePoint p = circle1.moveBy(1, 1);
        assertEquals(2, p.x, "X coordinate after move should be 2");
        assertEquals(3, p.y, "Y coordinate after move should be 3");
    }

    // Test a simple negative move
    @Test
    public void simpleMoveNeg() {
        CirclePoint p = circle1.moveBy(-1, -1);
        assertEquals(0, p.x, "X coordinate after negative move should be 0");
        assertEquals(1, p.y, "Y coordinate after negative move should be 1");
    }

    // Test scaling the circle positively
    @Test
    public void scalePositive() {
        double newRadius = circle1.scale(2.0); // Should double the radius
        assertEquals(6, newRadius, "Radius after scaling positively should be 6");
    }

    // Test scaling the circle with a negative factor (should not change)
    @Test
    public void scaleNegative() {
        double originalRadius = circle1.radius;
        double newRadius = circle1.scale(-1.0); // Should not change the radius
        assertEquals(originalRadius, newRadius, "Radius after scaling negatively should remain unchanged");
    }

    // Test intersection of two circles that do intersect
    @Test
    public void intersectingCircles() {
        Circle1 otherCircle = new Circle1(3, 3, 2); // This circle should intersect with circle1
        assertTrue(circle1.intersects(otherCircle), "Circles should intersect");
    }

    // Test intersection of two circles that do not intersect
    @Test
    public void nonIntersectingCircles() {
        Circle1 otherCircle = new Circle1(10, 10, 1); // This circle should not intersect with circle1
        assertFalse(circle1.intersects(otherCircle), "Circles should not intersect");
    }
}
