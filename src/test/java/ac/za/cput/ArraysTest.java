package ac.za.cput;


import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by SHiRO_333 on 2016-03-06.
 */
public class ArraysTest extends TestCase
{
     public void testAddStrings()
     {
         String[] expectedArray = {"first", "second", "third"};
         String[] resultArray = Arrays.getStringArray();
         assertArrayEquals(expectedArray, resultArray);
     }
}