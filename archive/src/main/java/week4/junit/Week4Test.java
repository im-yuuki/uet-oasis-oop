package week4.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class Week4Test {

    @Test
    public void testMax2Int1() {
        assertEquals(1, Week4.max2Int(0, 1));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(-1, Week4.max2Int(-999, -1));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(999, Week4.max2Int(999, 3));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(1000, Week4.max2Int(1000, -1000));
    }

    @Test
    public void testMinArray1() {
        assertEquals(1, Week4.minArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testMinArray2() {
        assertEquals(-5, Week4.minArray(new int[]{0, -1, -2, -3, -4, -5}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(0, Week4.minArray(new int[]{5, 4, 3, 2, 1, 0}));
    }

    @Test
    public void testMinArray4() {
        assertEquals(-4, Week4.minArray(new int[]{3, -1, 2, -4, 5}));
    }

    @Test
    public void testMinArray5() {
        assertEquals(42, Week4.minArray(new int[]{42}));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Béo phì", Week4.calculateBMI(80, 1.6));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.7));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Thừa cân", Week4.calculateBMI(70, 1.7));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(50, 1.6));
    }

}