package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class NonNullnessTest extends TestCase
{
    public void testConcatenate()
    {
            String result = NonNullness.concatenate("This is", " not null");
            String expected = "This is not null";
            assertNotNull(expected, result);
    }

}