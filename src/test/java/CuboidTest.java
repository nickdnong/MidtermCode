import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CuboidTest {

    private static final double DELTA = 0.001;

    @Test
    public void construction() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(5, 3, 20);
        assertTrue(cuboid0 instanceof Shape);
        assertTrue(cuboid1 instanceof Shape);


        assertTrue(cuboid0 instanceof Rectangle);
        assertTrue(cuboid1 instanceof Rectangle);

        assertTrue(cuboid0 instanceof Cuboid);
        assertTrue(cuboid1 instanceof Cuboid);

    }

    @Test
    public void getDepth() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(5, 3, 20);
        assertEquals(2, cuboid0.getDepth());
        assertEquals(20, cuboid1.getDepth());


    }

    @Test
    public void setDepth() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(5, 3, 2);
        cuboid0.setDepth(13);
        cuboid1.setDepth(113);
        assertEquals(13, cuboid0.getDepth());
        assertEquals(113, cuboid1.getDepth());
    }

    @Test
    public void volume() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(5, 3, 2);
        assertEquals(12, cuboid0.volume(), DELTA);
        assertEquals(30, cuboid1.volume(), DELTA);
    }

    @Test
    public void area() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(5, 3, 2);
        assertEquals(32, cuboid0.area(), DELTA);
        assertEquals(62, cuboid1.area(), DELTA);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void perimeter() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        cuboid0.perimeter();

    }

    @Test
    public void SortByVolumn() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(20, 10, 4);
        Cuboid cuboid2 = new Cuboid(10, 10, 10);
        Cuboid cuboid3 = new Cuboid(5, 3, 2);
        List<Cuboid> cuboids = Arrays.asList(cuboid0, cuboid1, cuboid2, cuboid3);
        List<Cuboid> sortedCuboids = Arrays.asList(cuboid0, cuboid3, cuboid1, cuboid2);

        Collections.sort(cuboids, new SortByVolumn());

        for (int i = 0; i < cuboids.size(); i++) {
            assertEquals(sortedCuboids.get(i).volume(), cuboids.get(i).volume(), DELTA);
        }
    }

    @Test
    public void SortByArea() {
        Cuboid cuboid0 = new Cuboid(2, 3, 2);
        Cuboid cuboid1 = new Cuboid(20, 10, 4);
        Cuboid cuboid2 = new Cuboid(10, 10, 10);
        Cuboid cuboid3 = new Cuboid(5, 3, 2);
        List<Cuboid> cuboids = Arrays.asList(cuboid0, cuboid1, cuboid2, cuboid3);
        List<Cuboid> sortedCuboids = Arrays.asList(cuboid0, cuboid3, cuboid2, cuboid1);

        Collections.sort(cuboids, new SortByArea());

        for (int i = 0; i < cuboids.size(); i++) {
            assertEquals(sortedCuboids.get(i).area(), cuboids.get(i).area(), DELTA);
        }

    }

}