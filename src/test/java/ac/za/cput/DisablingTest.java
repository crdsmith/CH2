package ac.za.cput;

import junit.framework.TestCase;
import org.junit.Ignore;

/**
 * Created by SHiRO_333 on 2016-04-15.
 */
public class DisablingTest extends TestCase
{
        @Ignore
        public void testAdd() {
            int first = 5;
            int second = 5;

            int expected = 10;
            int result = Disabling.add(first, second);
            assertEquals(expected, result);
        }

}
