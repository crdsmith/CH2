package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class TruthTest extends TestCase {
    public void testGetName()
    {
        assertTrue(Truth.getName("John"));
    }

}