package lesson2;

import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void test1() {
        HomeWork hw = new HomeWork();
        Assert.assertTrue(hw.checkArray(new int[]{1, 2, 3, 5, 1}));
        Assert.assertTrue(hw.checkArray(new int[]{1, 2, 1, 3, 1, 2, 5, 1}));
        Assert.assertTrue(hw.checkArray(new int[]{1, 2, 6, 3, 5, 1}));
        Assert.assertTrue(hw.checkArray(new int[]{1, -1}));
    }

    @Test
    public void test2() {
        HomeWork hw = new HomeWork();
        Assert.assertFalse(hw.checkArray(new int[]{1, 2, 3, 5, 4}));
    }
}
