package ac.za.cput;

import junit.framework.TestCase;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class ObjectIdentityTest extends TestCase {
    public void testConcatenate(){
        ObjectIdentity identity1 = new ObjectIdentity();
        ObjectIdentity identity2 = new ObjectIdentity();

        String result1 = identity1.concatenate("This will be joined", " to this");
        String result2 = identity2.concatenate("This will be joined", " to this");

        assertSame(result1, result1);
    }

}