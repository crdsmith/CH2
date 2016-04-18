package ac.za.cput;

import org.junit.Ignore;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by SHiRO_333 on 2016-04-15.
 */
public class TimeoutsTest extends TestCase
{
    @Test (timeout = 1)
    public void testAddIntegerse()
    {
        int first = 5;
        int second = 6;

        int expected = 11;
        int result = Timeouts.addIntegers(first, second);
        assertEquals(expected, result);
    }

}
