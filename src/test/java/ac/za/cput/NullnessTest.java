package ac.za.cput;

        import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class NullnessTest extends TestCase
{
    public void testConcatenate()
    {
        String result = null;
        String expected = "This is not null";
        assertNull(expected, result);
    }

}