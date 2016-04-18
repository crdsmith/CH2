package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class ExceptionsTest extends TestCase
{
    public void testDevide()
    {
        try
        {
            int result = Exceptions.devide(10, 0);
            int expected = 10;
            fail("Exception not thrown");
            assertEquals(expected, result);

        }catch(Exception e)
        {
            System.out.println("Exception: Cannot devide by Zero");
        }

    }



}