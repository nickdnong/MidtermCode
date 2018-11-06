import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {

    static final double DELTA = 0.001;

    @Test
    public void construction() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        assertTrue(rect0 instanceof Rectangle);
        assertTrue(rect1 instanceof Rectangle);

        assertTrue(rect0 instanceof Shape);
        assertTrue(rect1 instanceof Shape);

    }

    @Test
    public void getWidth() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        assertEquals(2, rect0.getWidth());
        assertEquals(5, rect1.getWidth());
    }

    @Test
    public void setWidth() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        rect0.setWidth(10);
        rect1.setWidth(20);
        assertEquals(10, rect0.getWidth());
        assertEquals(20, rect1.getWidth());
    }

    @Test
    public void getLength() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 30);
        assertEquals(3, rect0.getLength());
        assertEquals(30, rect1.getLength());

    }

    @Test
    public void setLength() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        rect0.setLength(10);
        rect1.setLength(20);
        assertEquals(10, rect0.getLength());
        assertEquals(20, rect1.getLength());
    }

    @Test
    public void compareTo() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(15, 57);
        Rectangle rect3 = new Rectangle(15, 3);

        List<Rectangle> rectangles = Arrays.asList(rect0, rect1, rect2, rect3);
        List<Rectangle> targetRectangles = Arrays.asList(rect0, rect1, rect3, rect2);

        assertTrue(rect0.compareTo(rect1) < 0);
        assertTrue(rect1.compareTo(rect0) > 0);
        assertTrue(rect0.compareTo(rect0) == 0);
        assertTrue(rect1.compareTo(rect1) == 0);

        Collections.sort(rectangles);
        for (int i = 0; i < rectangles.size(); i++) {
            assertEquals(targetRectangles.get(i).area(), rectangles.get(i).area(), DELTA);
        }
    }

    @Test
    public void area() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);

        assertEquals(rect0.area(), 6, DELTA);
        assertEquals(rect1.area(), 15, DELTA);
    }

    @Test
    public void perimeter() {
        Rectangle rect0 = new Rectangle(2, 3);
        Rectangle rect1 = new Rectangle(5, 3);
        assertEquals(rect0.perimeter(), 10, DELTA);
        assertEquals(rect1.perimeter(), 16, DELTA);
    }
}