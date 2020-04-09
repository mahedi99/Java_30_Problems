package distance_3D_space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahedi Hassan
 * 2020-04-02
 */

class PointTest {
    @Test
    public void calculate3DSpace(){
        Point point1 = new Point(8, 2, 6);
        Point point2 = new Point(8, 6, 3);
        assertTrue(Double.compare(5, point1.calculate3DSpace(point2)) == 0);
    }
}