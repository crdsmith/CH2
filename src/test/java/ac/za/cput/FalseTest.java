package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class FalseTest extends TestCase {
    public void testGetName() {

        assertFalse(False.getName("Johnny"));
    }

}