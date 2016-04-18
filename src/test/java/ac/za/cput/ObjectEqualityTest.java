package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class ObjectEqualityTest extends TestCase {
    public void testConcat(){
        ObjectEquality obj = new ObjectEquality();

        String result = obj.concat("This will be joined", " to this");
        assertEquals("This will be joined to this", result);
    }

}