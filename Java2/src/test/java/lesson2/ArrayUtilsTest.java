package lesson2;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link ArrayUtils}
 * @author mikelevin
 * */
public class ArrayUtilsTest {

    @Test
    public void testSize() {
        Assert.assertThrows(
                MyArraySizeException.class,
                () -> {
                    ArrayUtils.processArray(new String[][]{});
                }
        );
    }

    @Test
    public void testSizeDif() {
        Assert.assertThrows(
                MyArraySizeException.class,
                () -> {
                    ArrayUtils.processArray(new String[][]{
                            {"123", "123", "123", "123"},
                            {"123", "123", "123", "123"},
                            {"123", "123", "123"},
                            {"123", "123", "123", "123"},
                    });
                }
        );
    }

    @Test
    public void testSizeNPE() {
        Assert.assertThrows(
                MyArraySizeException.class,
                () -> {
                    ArrayUtils.processArray(new String[][]{
                            {},
                            {},
                            {"123", "123", "123"},
                            {},
                    });
                }
        );
    }

    @Test
    public void testData() {
        Assert.assertThrows(
                MyArrayDataException.class,
                () -> {
                    ArrayUtils.processArray(new String[][]{
                            {"123", "123", "123", "123"},
                            {"123", "123", "123", "123"},
                            {"123", "123.", "123", "123"},
                            {"123", "123", "123", "123"}
                    });
                }
        );
    }

    @Test
    public void testSum() {
        Assert.assertEquals(16,
                ArrayUtils.processArray(new String[][]{
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"}
                }));
    }

}
