package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class FloatingPointTest extends TestCase
{
    public void testCompare()
    {
        float value1 = 10.3f;
        float value2 = 6.4f;

        float expected = 16.7f;
        float result = FloatingPoint.compare(value1, value2);
        assertEquals(expected, result, 0.001);
    }

}