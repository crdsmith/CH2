package ac.za.cput;

import junit.framework.TestCase;
import junit.framework.TestCase;

/**
 *
 */
public class IntegersTest extends TestCase
{
    public void testAddIntegers()
    {
    int first = 5;
    int second = 6;

    int expected = 11;
    int result = Integers.addIntegers(first, second);
    assertEquals(expected, result, 0.001);
}

}